package leetcode.editor.en;

import leetcode.editor.en.utils.ListNode;

import java.util.ArrayList;
import java.util.List;

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
            ListNode res = new ListNode(0);
            ListNode curr = res;
            boolean carry = false;

            while (l1 != null || l2 != null || carry){
                int n1 = 0;
                int n2 = 0;
                if (l1 != null) n1 = l1.val;
                if (l2 != null) n2 = l2.val;

                int sum = n1 + n2;if (l1 != null) n1 = l1.val;
                if (l2 != null) n2 = l2.val;


                if (carry) {
                    sum ++;
                    carry = false;
                }

                ListNode temp = new ListNode();
                temp.val = sum % 10;

                if (sum / 10 > 0){
                    carry = true;
                }

                curr.next = temp;
                curr = curr.next;
                if (l1 != null) l1 = l1.next;
                if (l2 != null) l2 = l2.next;



            }

            return res.next;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}