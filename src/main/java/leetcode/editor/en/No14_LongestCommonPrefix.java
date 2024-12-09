  package leetcode.editor.en;
  public class No14_LongestCommonPrefix{
      public static void main(String[] args) {
           Solution solution = new No14_LongestCommonPrefix().new Solution();
      }
/* 
[14]Longest Common Prefix
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int len = strs.length;
        int shortest = 201;
        char[][] chars = new char[len][];

        for (int i = 0; i < len; i++) {
            String str = strs[i];
            chars[i] = str.toCharArray();
            shortest = Math.min(shortest, chars[i].length);
        }

        for (int i = 0; i < shortest; i++) {
            char curr = chars[0][i];
            boolean isDifferent = false;
            for (int j =1; j < len; j++) {
                if (chars[j][i] != curr){
                    isDifferent = true;
                    break;
                }
            }
            if (isDifferent) break;
            else sb.append(curr);
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }