  package leetcode.editor.en;

  import java.util.Stack;

  public class No20_ValidParentheses{
      public static void main(String[] args) {
           Solution solution = new No20_ValidParentheses().new Solution();
      }
/* 
[20]Valid Parentheses
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for (char c : chars){
            if (!stack.isEmpty() && matcher(stack.peek(), c)){
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }

    private boolean matcher(char open, char close){
        return switch (close){
            case ')' -> open == '(';
            case ']' -> open == '[';
            case '}' -> open == '{';
            default -> false;
        };
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }