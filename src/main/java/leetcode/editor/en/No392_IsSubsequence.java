  package leetcode.editor.en;
  public class No392_IsSubsequence{
      public static void main(String[] args) {
           Solution solution = new No392_IsSubsequence().new Solution();
      }
/* 
[392]Is Subsequence
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) return false;
        if (s.length() == 0 ) return true;
        if (t.length() == 0) return false;

        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();

        int index = 0;

        for (int i = 0; i < ct.length; i++) {
            if (ct[i] == cs[index]) index++;
            if (index == s.length()) return true;
        }
        return index == s.length() ;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }