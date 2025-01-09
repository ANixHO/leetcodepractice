package leetcode.editor.en;

import leetcode.editor.en.utils.ListNode;

public class No19_RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {
        Solution solution = new No19_RemoveNthNodeFromEndOfList().new Solution();
    }
/* 
[19]Remove Nth Node From End of List
*/
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
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode curr = head;
            // get the list size
            int size = 1;
            while (curr.next != null) {
                curr = curr.next;
                size++;
            }
            // deal with extreme case
            // due to 1 <= n <= size, if size == 1, n must be 1
            if (size == 1) return null;
            // if size == n, it means remove the head node, so just return the head.next
            if (size == n) return head.next;

            curr = head;

            for (int i = 0; i < size - n - 1; i++) {
                curr = curr.next;
            }

            curr.next = curr.next.next;

            return head;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}