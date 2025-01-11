  package leetcode.editor.en;

  import leetcode.editor.en.utils.ListNode;

  public class No82_RemoveDuplicatesFromSortedListIi{
      public static void main(String[] args) {
           Solution solution = new No82_RemoveDuplicatesFromSortedListIi().new Solution();
      }
/* 
[82]Remove Duplicates from Sorted List II
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyHead = new ListNode(0, head);
        ListNode prev = dummyHead;

        while (head != null){
            int v = head.val;

            if (head.next != null && head.next.val == v){
                while(head.next != null && head.val == v){
                    head = head.next;
                }

                if (head.val == v){
                    prev.next = null;
                } else {
                    prev.next = head;
                }
            } else {
                prev = prev.next;
                head = head.next;
            }
        }

        return dummyHead.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }