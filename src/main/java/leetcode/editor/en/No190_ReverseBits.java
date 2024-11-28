  package leetcode.editor.en;
  public class No190_ReverseBits{
      public static void main(String[] args) {
           Solution solution = new No190_ReverseBits().new Solution();
      }
/* 
[190]Reverse Bits
*/
      //leetcode submit region begin(Prohibit modification and deletion)
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int reversed = 0;
        for (int i = 0; i < 32; i++) {
            reversed <<= 1;
            reversed += n & 1;
            n >>= 1;
        }
        return reversed;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }