  package leetcode.editor.en;

  import leetcode.editor.en.utils.ListNode;

  public class No61_RotateList{
      public static void main(String[] args) {
           Solution solution = new No61_RotateList().new Solution();
      }
/* 
[61]Rotate List
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
    public ListNode rotateRight(ListNode head, int k) {
        // handle the extreme case
        if (head == null || head.next == null || k == 0) return head;

        // get the length of the linked list
        int len = 1;
        ListNode curr = head;

        while(curr.next != null){
            len++;
            curr = curr.next;
        }

        // link the last node of the linked list to head node.
        // make it kind of circle linked list
        curr.next = head;

        // calculate the location of the end node of the rotated linked list
        k %= len;
        k = len -k;

        // move forward to the end node of the rotated linked list
        while(k-- > 0){
            curr = curr.next;
        }

        // organise the head and end node
        head = curr.next;
        curr.next = null;

        return head;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }