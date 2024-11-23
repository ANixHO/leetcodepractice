  package leetcode.editor.en;

  import leetcode.editor.en.utils.TreeNode;

  import java.util.ArrayList;
  import java.util.List;

  public class No173_BinarySearchTreeIterator{
      public static void main(String[] args) {
           Solution solution = new No173_BinarySearchTreeIterator().new Solution();
      }
/* 
[173]Binary Search Tree Iterator
*/
      //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class BSTIterator {
    private TreeNode newRoot = new TreeNode(0);
    private TreeNode head = newRoot;
    public BSTIterator(TreeNode root) {
        dfs(root);
    }
    
    public int next() {
        head = head.right;
        return head.val;
    }
    
    public boolean hasNext() {
        return head.right != null;
    }

    private void dfs(TreeNode node){
        if (node == null) return;

        if (node.left != null) dfs(node.left);

        newRoot.right = node;
        newRoot = newRoot.right;

        if (node.right != null) dfs(node.right);

    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
//leetcode submit region end(Prohibit modification and deletion)

  }