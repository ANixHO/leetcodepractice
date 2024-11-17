  package leetcode.editor.en;

  import java.util.Objects;
  import java.util.Stack;

  public class No150_EvaluateReversePolishNotation{
      public static void main(String[] args) {
           Solution solution = new No150_EvaluateReversePolishNotation().new Solution();
      }
/* 
[150]Evaluate Reverse Polish Notation
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String s : tokens){
            if (isOperator(s)) {
                int i2 = stack.pop();
                int i1 = stack.pop();
                int res = calculator(i1, i2, s  );
                stack.push(res);
            }else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
    private int calculator(int i1, int i2, String operator){
        return switch (operator){
            case "+" -> i1 + i2;
            case "-" -> i1 - i2;
            case "*" -> i1 * i2;
            case "/" -> i1 / i2;
            default -> 0;
        };
    }

    private boolean isOperator(String s){
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }