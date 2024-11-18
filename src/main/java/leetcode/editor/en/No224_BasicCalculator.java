  package leetcode.editor.en;
  public class No224_BasicCalculator{
      public static void main(String[] args) {
           Solution solution = new No224_BasicCalculator().new Solution();
           solution.calculate("1 + 1");
      }
/* 
[224]Basic Calculator
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int index = 0;
    public int calculate(String s) {
      char[] chars = s.toCharArray();
      return helper(chars);
    }

    private int helper(char[] chars){
        int res = 0;
        int num = 0;
        int sign = 1;

        while(index < chars.length){
            char c = chars[index++];
            if (c >= 48 && c <= 57){
                num = num * 10 + c - '0';
            } else if (c == '(' ){
                num = helper(chars);
            } else if (c == ')'){
                res += num * sign;
                return res;
            } else if (c == '+' || c == '-'){
                res += num * sign;
                num = 0;
                sign = c == '+' ? 1 : -1;
            }
        }
        res += num * sign;
        return res;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }