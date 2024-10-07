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

        int[] arr = new int[100000];
        int size = 0;
        int max = 0;

        while (head != null){
            arr[size++] = head.val;
            head = head.next;
        }

        int len = size / 2;
        for (int i = 0; i < len ; i++) {
            size--;
            int temp = arr[i] + arr[size];
            if (temp > max) max = temp;
        }

        return max;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}