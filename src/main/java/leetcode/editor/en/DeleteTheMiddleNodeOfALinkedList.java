package leetcode.editor.en;

import leetcode.editor.en.utils.ListNode;


public class DeleteTheMiddleNodeOfALinkedList {
    public static void main(String[] args) {
        Solution solution = new DeleteTheMiddleNodeOfALinkedList().new Solution();
    }
// [2095]Delete the Middle Node of a Linked List
//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode deleteMiddle(ListNode head) {
            if (head.next == null) return null;
            ListNode fast = head;
            ListNode slow = head;
            ListNode prev = slow;
            int count = 1;

            while (fast.next != null) {
                fast = fast.next;
                count++;
                if (count % 2 == 0) {
                    prev = slow;
                    slow = slow.next;
                }
            }

            prev.next = slow.next;

            return head;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}

