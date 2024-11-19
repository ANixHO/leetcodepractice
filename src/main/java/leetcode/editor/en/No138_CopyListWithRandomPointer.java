package leetcode.editor.en;

import leetcode.editor.en.utils.Node;

import java.util.HashMap;
import java.util.Map;

public class No138_CopyListWithRandomPointer {
    public static void main(String[] args) {
        Solution solution = new No138_CopyListWithRandomPointer().new Solution();
    }
/* 
[138]Copy List with Random Pointer
*/
    //leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

    class Solution {
        public Node copyRandomList(Node head) {
            if (head == null) return null;
            Map<Node, Node> map = new HashMap<>();
            Node head1 = head;

            while(head1 != null){
                map.put(head1, new Node(head1.val));
                head1 = head1.next;
            }
            map.put(null, null);

            Node res = new Node(0);
            Node newCurr = res;
            Node curr = head;

            while(curr != null){
                Node temp = map.get(curr);
                temp.next = map.get(curr.next);
                temp.random = map.get(curr.random);
                newCurr.next = temp;
                newCurr = newCurr.next;
                curr = curr.next;
            }

            return res.next;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}