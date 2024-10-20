package leetcode.editor.en;

import java.util.Stack;

public class ValidParentheses{
    public static void main(String[] args) {
        Solution solution = new ValidParentheses().new Solution();
    }
// [20]Valid Parentheses
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        int len = chars.length;

        for (int i = 0; i < len; i++) {
            if (!stack.isEmpty() && isPair(stack.peek(), chars[i])){
                stack.pop();
            } else {
                stack.add(chars[i]);
            }
        }

        if (stack.isEmpty()) return true;
        else return false;

    }

    private boolean isPair(char c1, char c2){
        return switch (c1) {
            case '(' -> c2 == ')';
            case '{' -> c2 == '}';
            case '[' -> c2 == ']';
            default -> false;
        };
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}