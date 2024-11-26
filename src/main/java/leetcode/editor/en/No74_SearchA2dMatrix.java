  package leetcode.editor.en;
  public class No74_SearchA2dMatrix{
      public static void main(String[] args) {
           Solution solution = new No74_SearchA2dMatrix().new Solution();
      }
/* 
[74]Search a 2D Matrix
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int left = 0;
        int right = row * col - 1;

        while(right >= left){
            int mid = (right - left) / 2 + left;
            int curr = matrix[mid/col][mid%col];
            if (curr > target) right = mid - 1;
            else if (curr < target) left = mid + 1;
            else return true;
        }
        return false;
    }


}
//leetcode submit region end(Prohibit modification and deletion)

  }