package leetcode.editor.en;

import leetcode.editor.en.utils.ListNode;

import java.util.ArrayList;
import java.util.List;

public class LinkedListCycle{
    public static void main(String[] args) {
        Solution solution = new LinkedListCycle().new Solution();
    }
// [141]Linked List Cycle
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        List<ListNode> list = new ArrayList<>();
        ListNode cur = head;

        while(cur.next != null){
            if (list.contains(cur)){
                return true;
            }
            list.add(cur);
            cur = cur.next;

        }

        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}