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
            if (head == null) return null;
            else if (head.next == null || head.next.next == null) return head;

            ListNode oddHead = head.next;
            ListNode oddCur = oddHead;
            ListNode fast = oddCur.next;
            ListNode evenCur = fast;
            int count = 1;

            head.next = fast;

            while (fast.next != null){
                count ++;
                fast = fast.next;

                if (count % 2 == 0){
                    oddCur.next = fast;
                    oddCur = oddCur.next;
                }else if (count % 2 == 1){
                    evenCur.next = fast;
                    evenCur = evenCur.next;
                }
            }

            oddCur.next = null;
            evenCur.next = oddHead;

            return head;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}

