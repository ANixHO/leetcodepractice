package leetcode.editor.en;

import leetcode.editor.en.utils.Node;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer{
    public static void main(String[] args) {
        Solution solution = new CopyListWithRandomPointer().new Solution();
    }
// [138]Copy List with Random Pointer
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
        Node curr = head;

        Map<Node, Node> map = new HashMap<>();
        while(curr != null){
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        curr = head;
        while(curr != null){
            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);
            curr = curr.next;
        }
        return map.get(head);

    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}