package leetcode.editor.en;

import leetcode.editor.en.utils.ListNode;

public class ReverseLinkedListIi{
    public static void main(String[] args) {
        Solution solution = new ReverseLinkedListIi().new Solution();
    }
// [92]Reverse Linked List II
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null) return head;
        int count = 1 ;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = head;
        ListNode prev = dummy;
        for (int i = 1; i < left; i++) {
            curr = curr.next;
            prev = prev.next;
        }

        ListNode fast = null;
        ListNode subHead = curr;
        ListNode prevNode = null;
        for (int i = 1; i <= right - left + 1; i++) {
            fast = curr.next;
            curr.next = prevNode;
            prevNode = curr;
            curr = fast;

        }

        prev.next = prevNode;
        subHead.next = fast;

        return dummy.next;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}