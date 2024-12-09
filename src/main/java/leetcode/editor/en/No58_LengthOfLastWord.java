  package leetcode.editor.en;
  public class No58_LengthOfLastWord{
      public static void main(String[] args) {
           Solution solution = new No58_LengthOfLastWord().new Solution();
      }
/* 
[58]Length of Last Word
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        int res = 0;
        boolean isWord = false;

        for (int i = len - 1; i >= 0; i--) {
            if (chars[i] != ' '){
                res++;
                isWord = true;
            } else if (chars[i] == ' ' && isWord) {
                break;
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }