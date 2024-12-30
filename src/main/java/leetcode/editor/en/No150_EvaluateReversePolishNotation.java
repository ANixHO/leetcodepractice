  package leetcode.editor.en;

  import java.util.Arrays;
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
        Stack<String> stack = new Stack<>();
        for (String token : tokens){
            if (!isOperator(token)){
                stack.push(token);
            } else {
                String s2 = stack.pop();
                String s1 = stack.pop();
                String curr = operate(s1, s2, token);
                stack.push(curr);
            }
        }
        return Integer.parseInt(stack.pop());

    }

    private boolean isOperator(String s){
        return s.equals("+") || s.equals("-") ||
                s.equals("*") || s.equals("/");
    }

    private String operate(String s1, String s2, String operator){
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        int res =  switch (operator){
            case "+" -> n1 + n2;
            case "-" -> n1 - n2;
            case "*" -> n1 * n2;
            case "/" -> n1 / n2;
            default -> 1;
        };
        return ""+res;
    }


}
//leetcode submit region end(Prohibit modification and deletion)

  }