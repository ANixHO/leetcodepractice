  package leetcode.editor.en;
  public class No13_RomanToInteger{
      public static void main(String[] args) {
           Solution solution = new No13_RomanToInteger().new Solution();
      }
      // [13]Roman to Integer
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int romanToInt(String s) {
        int prev = 0;
        char[] chars = s.toCharArray();
        int res = 0;

        for (int i = chars.length - 1; i >= 0 ; i--){
            int curr = helper(chars[i]);
            res += curr >= prev ? curr : -curr;
            prev = curr;
        }
        return res;
    }

    private int helper(char c){
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }