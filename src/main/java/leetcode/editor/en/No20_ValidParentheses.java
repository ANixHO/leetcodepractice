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
        int len = s.length();
        if (len % 2 == 1) return false;

        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char c : chars){
            if (c == '(' || c == '[' || c == '{'){
                stack.push(c);
            } else if (!stack.isEmpty() && helper(stack.peek(), c)){
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    private boolean helper(char c1, char c2){
        return switch (c1){
            case '(' -> c2 == ')';
            case '[' -> c2 == ']';
            case '{' -> c2 == '}';
            default -> false;
        };
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }