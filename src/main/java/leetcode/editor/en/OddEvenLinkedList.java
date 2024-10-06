package leetcode.editor.en;

import leetcode.editor.en.utils.ListNode;

import java.util.List;

public class OddEvenLinkedList {
    public static void main(String[] args) {
        Solution solution = new OddEvenLinkedList().new Solution();
        ListNode n5 = new ListNode(5,null);
        ListNode n4 = new ListNode(4,n5);
        ListNode n3 = new ListNode(3,n4);
        ListNode n2 = new ListNode(2,n3);
        ListNode n1 = new ListNode(1,n2);
        ListNode res = solution.oddEvenList(n1);
        System.out.println(res.toString());
    }
// [328]Odd Even Linked List
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
        public ListNode oddEvenList(ListNode head) {
            if (head == null || head.next == null ) return head;

            ListNode evenHead = head.next;
            ListNode curEven = head.next;
            ListNode oddHead = head;
            ListNode curOdd = head;

            ListNode cur = head.next.next;

            int index = 3;

            while (cur != null) {

                if (index % 2 == 0) {
                    // if current node is even
                    curEven.next = cur;
                    curEven = curEven.next;

                } else if (index % 2 == 1){
                    // if current node is odd
                    curOdd.next = cur;
                    curOdd = curOdd.next;
                }

                cur = cur.next;
                index++;
            }

            curEven.next = null;
            curOdd.next = evenHead;

            return oddHead;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}

