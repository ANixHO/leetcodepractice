package leetcode.editor.en;

import java.util.Stack;

public class SimplifyPath{
    public static void main(String[] args) {
        Solution solution = new SimplifyPath().new Solution();
    }
// [71]Simplify Path
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String simplifyPath(String path) {
        String[] strs = path.split("/");
        Stack<String> stack = new Stack<>();

        for (String str : strs){

            if (str.equals("") || str.equals(".")){
                continue;
            }

            if (str.equals("..")){
                if (!stack.isEmpty()){
                    stack.pop();
                }
            } else {
                stack.push(str);
            }
        }

        if (stack.isEmpty()) return "/";

        StringBuilder sb = new StringBuilder();
        for (String dir : stack){
            sb.append("/").append(dir);
        }

        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}