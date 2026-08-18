/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return merge(list1, list2);

    }


     public ListNode merge(ListNode list, ListNode otherList) {
        if(list == null && otherList == null) {
            return null;
        }

        if(list == null) {
            return otherList;
        }

        if(otherList == null) {
            return list;
        }

        if(list.val <= otherList.val) {
            list.next = merge(list.next, otherList);
            return list;
        } else {
            otherList.next = merge(list, otherList.next);
            return otherList;
        }
    }
}