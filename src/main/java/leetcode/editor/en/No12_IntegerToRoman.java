  package leetcode.editor.en;
  public class No12_IntegerToRoman{
      public static void main(String[] args) {
           Solution solution = new No12_IntegerToRoman().new Solution();
      }
/* 
[12]Integer to Roman
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String intToRoman(int num) {
        int[] values = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while(num >= values[i]){
                res.append(symbols[i]);
                num -= values[i];
            }
        }
        return res.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }