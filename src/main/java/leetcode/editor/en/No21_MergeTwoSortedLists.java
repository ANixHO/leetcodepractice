  package leetcode.editor.en;

  import leetcode.editor.en.utils.ListNode;

  public class No21_MergeTwoSortedLists{
      public static void main(String[] args) {
           Solution solution = new No21_MergeTwoSortedLists().new Solution();
      }
/* 
[21]Merge Two Sorted Lists
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       ListNode curr = new ListNode();
       ListNode dummyHead = curr;

       while(list1 != null && list2 != null){
           if (list1.val <= list2.val){
               curr.next = new ListNode(list1.val);
               list1 = list1.next;
           } else {
               curr.next = new ListNode(list2.val);
               list2 = list2.next;
           }

           curr = curr.next;
       }

       while(list1 != null){
           curr.next = new ListNode(list1.val);
           curr = curr.next;
           list1 = list1.next;
       }
       while(list2 != null){
           curr.next = new ListNode(list2.val);
           curr = curr.next;
           list2 = list2.next;
       }

       return dummyHead.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }