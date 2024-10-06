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
            //better solution

            if (head.next == null){
                return null;
            }

            ListNode fast = head.next;
            ListNode slow = head;

            if(fast.next != null && slow.next != null){
                fast = fast.next;
            }

            while(fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }

            slow.next = slow.next.next;

            return head;


//            if(head.next == null){
//                return null;
//            } else if(head.next.next == null){
//                head.next = null;
//                return head;
//            }
//
//            int length = 1;
//            ListNode curN = head;
//
//            while(curN.next != null){
//                curN = curN.next;
//                length ++;
//            }
//
//            int mid = length / 2;
//            curN = head;
//
//            for (int i = 0; i < mid - 1; i++) {
//                curN = curN.next;
//            }
//            curN.next = curN.next.next;
//
//            return head;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}

