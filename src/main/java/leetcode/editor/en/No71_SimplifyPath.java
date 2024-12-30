  package leetcode.editor.en;

  import java.util.Stack;

  public class No71_SimplifyPath{
      public static void main(String[] args) {
           Solution solution = new No71_SimplifyPath().new Solution();
      }
/* 
[71]Simplify Path
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String simplifyPath(String path) {
        String[] paths = path.split("/");
        Stack<String> stack = new Stack<>();

        for(String str : paths){
            if (str.isEmpty() || str.equals(".")){
                continue;
            } else if ( str.equals("..")){
                if (!stack.isEmpty() ) {
                    stack.pop();
                }
            } else {
                stack.push(str);
            }
        }
        if (stack.isEmpty()) return "/";

        StringBuilder sb = new StringBuilder();
        for (String s : stack){
            sb.append("/").append(s);
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }