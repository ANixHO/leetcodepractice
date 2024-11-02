package leetcode.editor.en;

import leetcode.editor.en.utils.Node;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNodeIi {
    public static void main(String[] args) {
        Solution solution = new PopulatingNextRightPointersInEachNodeIi().new Solution();
    }
// [117]Populating Next Right Pointers in Each Node II
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
            queue.offer(root);

            while (!queue.isEmpty()) {
                Node prev = null;
                int size = queue.size();

                for (int i = 0; i < size; i++) {
                    Node cur = queue.poll();
                    if (cur.right != null) queue.offer(cur.right);
                    if (cur.left != null) queue.offer(cur.left);

                    cur.next = prev;
                    prev = cur;
                }

            }
            return root;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}