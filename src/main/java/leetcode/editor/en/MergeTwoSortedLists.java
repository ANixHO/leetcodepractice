package leetcode.editor.en;

import leetcode.editor.en.utils.ListNode;

public class MergeTwoSortedLists{
    public static void main(String[] args) {
        Solution solution = new MergeTwoSortedLists().new Solution();
    }
// [21]Merge Two Sorted Lists
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
        if (list1 != null && list2 != null){
            if (list1.val < list2.val){
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }
        if (list1 == null){
            return list2;
        } else {
            return list1;
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}