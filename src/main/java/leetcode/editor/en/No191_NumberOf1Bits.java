  package leetcode.editor.en;
  public class No191_NumberOf1Bits{
      public static void main(String[] args) {
           Solution solution = new No191_NumberOf1Bits().new Solution();
      }
/* 
[191]Number of 1 Bits
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int hammingWeight(int n) {
        int res = 0;

        while(n > 0 ){
            res += n % 2;
            n/= 2;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }