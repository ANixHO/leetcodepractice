package leetcode.editor.en;

import leetcode.editor.en.utils.TreeNode;

public class DeleteNodeInABst {
    public static void main(String[] args) {
        Solution solution = new DeleteNodeInABst().new Solution();
        TreeNode root = new TreeNode();
        root = root.arrayToTreeNode(new Integer[]{5, 3, 6, 2, 4, null, 7});

        solution.deleteNode(root, 3);
        root.toString();
    }
// [450]Delete Node in a BST
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
        public TreeNode deleteNode(TreeNode root, int key) {
            if (root == null) return root;

            TreeNode cur = root;
            TreeNode pre = null;

            // find the node that the value of node equals key
            while (cur != null) {
                if (cur.val == key) break;
                pre = cur;

                if (cur.val < key) {
                    cur = cur.right;
                } else {
                    cur = cur.left;
                }
            }

            if (cur == null) {
                return root;
            }

            if (cur.left == null || cur.right == null) {
                // if target node has only 1 child or no child,
                // redirect the pre node to child node of the target node
                TreeNode child = cur.left != null ? cur.left : cur.right;

                if (cur != root) {

                    if (pre.left == cur) {
                        pre.left = child;
                    } else {
                        pre.right = child;
                    }

                } else {
                    root = child;
                }
            } else {

                // if target node has two child nodes
                // put the left child node of target's right child node
                TreeNode temp = cur.right;
                TreeNode preTemp = temp;
                while (temp.left != null) {
                    preTemp = temp;
                    temp = temp.left;
                }

                deleteNode(root, temp.val);
                cur.val = temp.val;


            }

            return root;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}