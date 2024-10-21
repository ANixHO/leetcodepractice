package leetcode.editor.en;

import java.util.Stack;

public class BasicCalculator {
    public static void main(String[] args) {
        Solution solution = new BasicCalculator().new Solution();
    }

    // [224]Basic Calculator
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int calculate(String s) {
            int i = 0;
            return cal(s, i);
        }

        private int cal(String s, int i){
            int num = 0;
            int ans = 0;
            int sign = 1;

            while(i < s.length()){
                char c = s.charAt(i++);

                if (c >= 48 && c <=57){
                    num += num * 10 + c - '0';
                } else if (c == '('){
                    ans += cal(s, i);
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