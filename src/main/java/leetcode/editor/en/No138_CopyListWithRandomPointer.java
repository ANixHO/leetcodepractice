  package leetcode.editor.en;

  import leetcode.editor.en.utils.Node;

  import java.util.HashMap;
  import java.util.Map;

  public class No138_CopyListWithRandomPointer{
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
        Map<Node, Node> map = new HashMap<>();

        Node curr = head;
        while(curr != null){
            Node newNode = new Node(curr.val);
            map.put(curr, newNode);
            curr = curr.next;
        }
        map.put(null, null);

        curr = head;
        Node newCurr = map.get(curr);
        Node newHead = newCurr;

        while(newCurr != null){
            Node newNext = map.get(curr.next);
            Node newRandom = map.get(curr.random);

            newCurr.next = newNext;
            newCurr.random = newRandom;

            curr = curr.next;
            newCurr = newCurr.next;
        }

        return newHead;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }