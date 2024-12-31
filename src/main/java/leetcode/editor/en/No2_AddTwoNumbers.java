package leetcode.editor.en;

import leetcode.editor.en.utils.ListNode;

public class No2_AddTwoNumbers {
    public static void main(String[] args) {
        Solution solution = new No2_AddTwoNumbers().new Solution();
    }
/* 
[2]Add Two Numbers
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
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode res = new ListNode();
            ListNode reshead = res;
            int carry = 0;

            while (l1 != null || l2 != null || carry != 0) {
                int n1 = 0;
                int n2 = 0;
                if (l1 != null) n1 = l1.val;
                if (l2 != null) n2 = l2.val;
                int sum = n1 + n2 + carry;
                carry = sum / 10;
                sum %= 10;
                res.next = new ListNode(sum);
                res = res.next;
                if (l1 != null) {
                    l1 = l1.next;
                }
                if (l2 != null) {
                    l2 = l2.next;
                }
            }
            return reshead.next;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}