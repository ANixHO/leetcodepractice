package leetcode.editor.en;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        Solution solution = new EvaluateReversePolishNotation().new Solution();
    }

    // [150]Evaluate Reverse Polish Notation
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int evalRPN(String[] tokens) {
            if (tokens.length == 1) return Integer.parseInt(tokens[0]);
            Stack<String> stack = new Stack<>();

            for (String str : tokens) {
                if (!isNotDigit(str)) {
                    stack.push(str);
                } else {
                    String operator = str;
                    String num2 = stack.pop();
                    String num1 = stack.pop();

                    int res = calculator(operator, num1, num2);
                    stack.push("" + res);
                }
            }

            return Integer.parseInt(stack.pop());
        }

        private int calculator(String operator, String num1, String num2) {
            int n1 = Integer.parseInt(num1);
            int n2 = Integer.parseInt(num2);
            int res = 0;

            switch (operator) {
                case "+" -> res = n1 + n2;
                case "-" -> res = n1 - n2;
                case "*" -> res = n1 * n2;
                case "/" -> res = n1 / n2;
            }

            return res;
        }

        private boolean isNotDigit(String str) {
            return str.equals("+") || str.equals("-") || str.equals("/") || str.equals("*");
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}