  package leetcode.editor.en;

  import leetcode.editor.en.utils.ListNode;
  import leetcode.editor.en.utils.TreeNode;

  import java.util.ArrayList;
  import java.util.Collections;
  import java.util.List;

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
        if (head == null || head .next == null ) return head;
        List<Integer> list = new ArrayList<>();
        int len = 0;
        ListNode curr = head;

        while (curr != null){
            list.add(curr.val);
            len++;
            curr = curr.next;
        }

        Collections.sort(list);
        ListNode prev = null;
        while (len > 0 ){
            ListNode node = new ListNode(list.get(--len));
            node.next = prev;
            prev = node;
        }

        return prev;


    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }