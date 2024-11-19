  package leetcode.editor.en;

  import leetcode.editor.en.utils.ListNode;

  public class No92_ReverseLinkedListIi{
      public static void main(String[] args) {
           Solution solution = new No92_ReverseLinkedListIi().new Solution();
      }
/* 
[92]Reverse Linked List II
*/
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
        if ( head == null || head.next == null) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = head;
        ListNode leftNode = dummy;

        for (int i = 1 ; i < left; i ++){
            leftNode = leftNode.next;
            curr = curr.next;
        }

        ListNode subHead = curr;


        ListNode fast = null;
        ListNode prev = null;

        for (int i = 1; i <= right - left + 1; i++) {
            fast = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fast;
        }
        leftNode.next = prev;
        subHead.next = fast;

        return dummy.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }