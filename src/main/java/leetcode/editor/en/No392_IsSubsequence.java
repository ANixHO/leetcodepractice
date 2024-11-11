  package leetcode.editor.en;
  public class No392_IsSubsequence{
      public static void main(String[] args) {
           Solution solution = new No392_IsSubsequence().new Solution();
      }
      // [392]Is Subsequence
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) return false;
        if (s.isEmpty()) return true;

        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();

        int indexS = 0;

        for (int i = 0; i < charsT.length; i++) {
            if (charsT[i] == charsS[indexS]){
                indexS ++;
                if (indexS == charsS.length) return true;
            }
        }

        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }