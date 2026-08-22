/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }

        Queue<TreeNode> queueP = new LinkedList<>();
        Queue<TreeNode> queueQ = new LinkedList<>();

        queueP.offer(p);
        queueQ.offer(q);

        while(!queueP.isEmpty() && !queueQ.isEmpty()) {
            TreeNode currentP = queueP.poll();
            TreeNode currentQ = queueQ.poll();

            if(currentP == null && currentQ != null) {
                return false;
            }


            if(currentP != null && currentQ == null) {
                return false;
            }

           
            if(currentP != null && currentQ != null && currentP.val != currentQ.val) {
                return false;
            }

            if(currentP != null) {
                queueP.offer(currentP.left);
                queueP.offer(currentP.right);
            }

            if(currentQ != null) {
                 queueQ.offer(currentQ.left);
                queueQ.offer(currentQ.right);
            }
            
           
        }

        return queueP.isEmpty() && queueQ.isEmpty();
    }
}
