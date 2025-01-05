package leetcode.editor.en;

import leetcode.editor.en.utils.Node;

import java.util.ArrayDeque;
import java.util.Deque;

public class No117_PopulatingNextRightPointersInEachNodeIi {
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
            if (root == null) return root;
            Deque<Node> que = new ArrayDeque();
            que.offer(root);

            while (!que.isEmpty()) {
                Node prev = null;
                int size = que.size();
                for (int i = 0; i < size; i++) {

                    Node curr = que.pop();
                    curr.next = prev;
                    prev = curr;
                    if (curr.right != null) que.offer(curr.right);
                    if (curr.left != null) que.offer(curr.left);
                }
            }

            return root;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}