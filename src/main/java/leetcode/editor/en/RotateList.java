package leetcode.editor.en;

import leetcode.editor.en.utils.ListNode;

public class RotateList{
    public static void main(String[] args) {
        Solution solution = new RotateList().new Solution();
    }
// [61]Rotate List
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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        int len = 1;
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
            len++;
        }

        temp.next = head;

        k = k % len;
        k = len - k;

        while(k-- > 0){
            temp = temp.next;
        }

        head = temp.next;
        temp.next = null;

        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}
