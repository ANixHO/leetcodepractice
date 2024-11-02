package leetcode.editor.en;

import leetcode.editor.en.utils.ListNode;

public class AddTwoNumbers{
    public static void main(String[] args) {
        Solution solution = new AddTwoNumbers().new Solution();
    }
// [2]Add Two Numbers
    //leetcode submit region begin(Prohibit modification and deletion)
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode cur = new ListNode(0);
        ListNode res = cur;


        do {
            int v1 = 0;
            int v2 = 0;
            if (l1 != null) v1 = l1.val;
            if (l2 != null) v2 = l2.val;

            carry += v1 + v2;
            cur.next = new ListNode(carry % 10);
            carry /= 10;
            cur = cur.next;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }while(l1 != null || l2 != null || carry != 0);

//        cur.next = null;
        return res.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}