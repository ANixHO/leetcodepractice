package leetcode.editor.en;

import com.sun.source.tree.Tree;
import leetcode.editor.en.utils.ListNode;
import leetcode.editor.en.utils.TreeNode;

import java.util.*;

public class SymmetricTree {
    public static void main(String[] args) {
        Solution solution = new SymmetricTree().new Solution();
    }
// [101]Symmetric Tree
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        public boolean isSymmetric(TreeNode root) {
            boolean res = isSame(root.left, root.right);
            return res;
        }

        private boolean isSame(TreeNode p, TreeNode q){
            if (p == null || q == null) return p == q;

            return (p.val == q.val) && isSame(p.left, q.right) && isSame(p.right, q.left);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}