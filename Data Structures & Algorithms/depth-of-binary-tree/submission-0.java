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
    record LevelTreeNode(TreeNode node, int level) {}
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        Queue<LevelTreeNode> queue = new LinkedList<>();
        int level = 1;
        queue.offer(new LevelTreeNode(root, 1));

        while(!queue.isEmpty()) {
            LevelTreeNode current = queue.poll();

            if(current != null) {
                
            }

            if(current.node.left != null) {
                queue.offer(new LevelTreeNode(current.node.left, current.level + 1));
            }

            if(current.node.right != null) {
                queue.offer(new LevelTreeNode(current.node.right, current.level + 1));
            }

            if(queue.isEmpty()) {
                level = current.level;
            }
        }

        return level;

    }
}
