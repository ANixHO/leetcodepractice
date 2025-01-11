  package leetcode.editor.en;

  import leetcode.editor.en.utils.ListNode;

  import java.util.Arrays;

  public class No148_SortList{
      public static void main(String[] args) {
           Solution solution = new No148_SortList().new Solution();
      }
/* 
[148]Sort List
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
    public ListNode sortList(ListNode head) {

        // get the length of the linked list
        int len = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            len++;
        }

        // make an array to abstract the values of linked list
        curr = head;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = curr.val;
            curr = curr.next;
        }

        // sort the array in ascending order
        Arrays.sort(arr);

        // implement the new linked list sorted in ascending order
        ListNode dummyHead = new ListNode(0);
        curr = dummyHead;
        for (int i = 0; i < len; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }

        return dummyHead.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }