package leetcode.editor.en;

import leetcode.editor.en.utils.ListNode;

public class RemoveDuplicatesFromSortedListIi{
    public static void main(String[] args) {
        Solution solution = new RemoveDuplicatesFromSortedListIi().new Solution();
    }
// [82]Remove Duplicates from Sorted List II
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
        ListNode dm = new ListNode(0, head);
        ListNode pre = dm;

        while(head != null){
            int va = head.val;

            if (head.next != null && head.next.val == va){

                while(head.next != null && head.val == va){
                    head = head.next;
                }

                if (head.val == va){
                    pre.next = null;
                } else {
                    pre.next = head;
                }

            } else {
                head = head.next;
                pre = pre.next;
            }
        }

        return dm.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}