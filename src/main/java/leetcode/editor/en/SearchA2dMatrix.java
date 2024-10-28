package leetcode.editor.en;
public class SearchA2dMatrix{
    public static void main(String[] args) {
        Solution solution = new SearchA2dMatrix().new Solution();
    }
// [74]Search a 2D Matrix
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int cols = matrix[0].length;
        int rows = matrix.length;
        int left = 0;
        int right = cols * rows - 1;

        while(right >= left){
            int mid = (right - left) / 2 + left;
            int row = mid / cols;
            int col = mid % cols;

            if (matrix[row][col] > target){
                right = mid - 1;
            } else if(matrix[row][col] < target){
                left = mid + 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}