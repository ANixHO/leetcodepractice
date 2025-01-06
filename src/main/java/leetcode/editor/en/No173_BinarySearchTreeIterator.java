  package leetcode.editor.en;

  import leetcode.editor.en.utils.TreeNode;

  import java.util.Stack;

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
    Stack<TreeNode> stack; // initialise a stack to store the node
    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        updateStack(root);
        
    }
    
    public int next() {
        TreeNode toRemove = stack.pop();
        // update the stack and next node
        // in in-order traversal, the very left leaf of the subtree is next node
        updateStack(toRemove.right);
        return toRemove.val;
    }
    
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    // traverse to the first node of in-order
    private void updateStack(TreeNode node){
        while(node != null){
            stack.add(node);
            node = node.left;
        }
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