  package leetcode.editor.en;

  import java.util.*;

  public class No205_IsomorphicStrings{
      public static void main(String[] args) {
           Solution solution = new No205_IsomorphicStrings().new Solution();
      }
/* 
[205]Isomorphic Strings
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();

        if (charsT.length != charsS.length) return false;

        int[] arrS = new int[127];
        int[] arrT = new int[127];

        for (int i = 0; i < charsS.length; i++) {
            if (arrS[charsS[i]] != arrT[charsT[i]]) return false;

            arrS[charsS[i]] = i + 1;
            arrT[charsT[i]] = i + 1;

        }

        return true;


    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }