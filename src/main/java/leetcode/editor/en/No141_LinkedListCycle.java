  package leetcode.editor.en;

  import leetcode.editor.en.utils.ListNode;

  import java.util.HashSet;
  import java.util.Set;

  public class No141_LinkedListCycle{
      public static void main(String[] args) {
           Solution solution = new No141_LinkedListCycle().new Solution();
      }
/* 
[141]Linked List Cycle
*/
      //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
       ListNode fast = head;
       ListNode slow = head;

       while(fast != null && fast.next != null){
           fast = fast.next.next;
           slow = slow.next;
           if (fast == slow) return true;
       }
       return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }