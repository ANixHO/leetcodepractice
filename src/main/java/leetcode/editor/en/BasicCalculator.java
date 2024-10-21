package leetcode.editor.en;

import java.util.Stack;

public class BasicCalculator {
    public static void main(String[] args) {
        Solution solution = new BasicCalculator().new Solution();
        solution.calculate("(1+(4+5+2)-3)+(6+8)");
    }

    // [224]Basic Calculator
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        private int i = 0;
        public int calculate(String s) {
            return cal(s);
        }

        private int cal(String s){
            int num = 0;
            int ans = 0;
            int sign = 1;

            while(i < s.length()){
                char c = s.charAt(i++);

                if (c >= '0' && c <='9'){
                    num = num * 10 + c - '0';

                } else if (c == '('){
                    num = cal(s);

                } else if (c == ')') {
                    ans += num * sign;
                    return ans;

                } else if (c == '+' || c == '-'){
                    ans += num * sign;
                    num = 0;
                    sign = ( c == '-') ? -1 : 1;
                }
            }

            ans += num *sign;
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}