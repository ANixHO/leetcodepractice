package leetcode.editor.en;

import leetcode.editor.en.utils.quadTreeNode.*;

public class No427_ConstructQuadTree {
    public static void main(String[] args) {
        Solution solution = new No427_ConstructQuadTree().new Solution();
    }
/* 
[427]Construct Quad Tree
*/
    //leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    
    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
}
*/

    class Solution {
        public Node construct(int[][] grid) {
            return helper(grid, 0,0 , grid.length);

        }

        private Node helper(int[][] grid, int row, int col, int len) {
            if (len == 1) {
                return new Node(grid[row][col] == 1, true);
            }

            Node topLeft = helper(grid, row, col, len /2);
            Node topRight = helper(grid, row, col + len/2, len/2);
            Node bottomLeft = helper(grid, row + len/2, col, len/2);
            Node bottomRight = helper(grid, row + len / 2, col + len / 2, len/ 2);

            boolean val = topLeft.val;
            boolean isLeaf;
            if (topLeft.val == topRight.val
                    && bottomLeft.val == bottomRight.val
                    && topLeft.val == bottomLeft.val
                    && topLeft.isLeaf && topRight.isLeaf
                    && bottomLeft.isLeaf && bottomRight.isLeaf) {
               return new Node(topLeft.val, true);
            } else {
                return new Node(true, false, topLeft, topRight, bottomLeft, bottomRight);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}