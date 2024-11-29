  package leetcode.editor.en;
  public class No69_Sqrtx{
      public static void main(String[] args) {
           Solution solution = new No69_Sqrtx().new Solution();
      }
/* 
[69]Sqrt(x)
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int mySqrt(int x) {
        int left= 1;
        int right = x;

        while(right >= left){
            int mid = (left + right) / 2;

            if (mid == x / mid){
                return mid;
            } else if (mid > x / mid){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return right;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }