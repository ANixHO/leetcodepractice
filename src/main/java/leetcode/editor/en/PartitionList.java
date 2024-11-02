package leetcode.editor.en;

import leetcode.editor.en.utils.ListNode;

public class PartitionList{
    public static void main(String[] args) {
        Solution solution = new PartitionList().new Solution();
    }
// [86]Partition List
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
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;

        ListNode lessHead = new ListNode(0);
        ListNode greatHead = new ListNode(0);
        ListNode less = lessHead;
        ListNode great = greatHead;
        ListNode curr = head;

        while(curr != null){
            if (curr.val >= x) {
                great.next = curr;
                great = great.next;
            } else {
                less.next = curr;
                less = less.next;
            }
            curr = curr.next;
        }
        great.next = null;
        less.next = greatHead.next;
        return lessHead.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}