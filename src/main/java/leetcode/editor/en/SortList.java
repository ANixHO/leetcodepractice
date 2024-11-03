package leetcode.editor.en;

import leetcode.editor.en.utils.ListNode;

import java.util.*;

public class SortList {
    public static void main(String[] args) {
        Solution solution = new SortList().new Solution();
    }
// [148]Sort List
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode sortList(ListNode head) {
            int len = 0;
            ListNode cur = head;

            while (cur != null) {
                len++;
                cur = cur.next;
            }

            int[] arr = new int[len];
            int index = 0;
            while(index < len){
                arr[index++] = head.val;
                head = head.next;

            }

            Arrays.sort(arr);
            ListNode prev = null;
            while(len>0){
                ListNode node = new ListNode(arr[--len]);
                node.next =prev;
                prev= node;
            }
            return prev;
        }

    }

//leetcode submit region end(Prohibit modification and deletion)

}