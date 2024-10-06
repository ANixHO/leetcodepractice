package leetcode.editor.en;

import java.util.List;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Solution solution = new ReverseLinkedList().new Solution();


    }
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


        public ListNode reverseList(ListNode head) {
            if(head == null || head.next == null){
                return head;
            }

            ListNode preNode = head;
            ListNode curNode = preNode.next;
            preNode.next = null;
            ListNode t = preNode;

            while(curNode.next != null){
                preNode = curNode;
                curNode = curNode.next;
                preNode.next = t;
                t = preNode;
            }

            curNode.next = preNode;

            return curNode;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}