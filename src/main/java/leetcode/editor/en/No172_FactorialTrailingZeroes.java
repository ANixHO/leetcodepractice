  package leetcode.editor.en;
  public class No172_FactorialTrailingZeroes{
      public static void main(String[] args) {
           Solution solution = new No172_FactorialTrailingZeroes().new Solution();
      }
/* 
[172]Factorial Trailing Zeroes
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int trailingZeroes(int n) {
        if (n == 0) return 0;
        int count = 0;
        while(n > 0){
            n /= 5;
            count += n;
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }