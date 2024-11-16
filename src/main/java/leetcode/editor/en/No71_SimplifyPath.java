package leetcode.editor.en;

import java.util.Stack;

public class No71_SimplifyPath {
    public static void main(String[] args) {
        Solution solution = new No71_SimplifyPath().new Solution();
        solution.simplifyPath("/../");
    }

    /*
    [71]Simplify Path
    */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String simplifyPath(String path) {
            String[] paths = path.split("/");
            Stack<String> stack = new Stack<>();

            for (String s : paths) {
                if (s.isEmpty() || s.equals(".")) {
                    continue;
                } else if (s.equals("..")) {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                } else {
                    stack.push(s);
                }
            }
            StringBuilder res = new StringBuilder();
            while (!stack.isEmpty()) {
                res.insert(0, "/" + stack.pop());
            }

            return res.isEmpty()? "/" : res.toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}