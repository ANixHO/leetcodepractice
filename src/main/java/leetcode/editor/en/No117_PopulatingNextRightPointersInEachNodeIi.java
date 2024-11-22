  package leetcode.editor.en;

  import leetcode.editor.en.utils.Node;

  import java.util.LinkedList;
  import java.util.Queue;
  import java.util.Stack;

  public class No117_PopulatingNextRightPointersInEachNodeIi{
      public static void main(String[] args) {
           Solution solution = new No117_PopulatingNextRightPointersInEachNodeIi().new Solution();
      }
/* 
[117]Populating Next Right Pointers in Each Node II
*/
      //leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if (root == null) return null;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            Node prev = null;

            for (int i = 0; i < size; i++) {
                Node curr = queue.poll();
                curr.next = prev;
                if (curr.right != null) queue.add(curr.right);
                if (curr.left != null) queue.add(curr.left);
                prev = curr;
            }
        }
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }