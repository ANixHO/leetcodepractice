package leetcode.editor.en;

import leetcode.editor.en.utils.ListNode;

import java.util.ArrayList;
import java.util.List;

public class MaximumTwinSumOfALinkedList{
    public static void main(String[] args) {
         Solution solution = new MaximumTwinSumOfALinkedList().new Solution();
    }
// [2130]Maximum Twin Sum of a Linked List
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
    public int pairSum(ListNode head) {
        List<Integer> list = new ArrayList<>();

        while (head != null){
            list.add(head.val);
            head = head.next;
        }

        int max = 0;
        int n = list.size();

        for (int i = 0; i < n / 2; i++) {
            int sum = (list.get(i) + list.get(n - 1 - i));
            if (max < sum) max = sum;
        }

        return max;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}