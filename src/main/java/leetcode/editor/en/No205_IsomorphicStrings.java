package leetcode.editor.en;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class No205_IsomorphicStrings {
    public static void main(String[] args) {
        Solution solution = new No205_IsomorphicStrings().new Solution();
    }

    /*
    [205]Isomorphic Strings
    */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isIsomorphic(String s, String t) {
            if (s.length() != t.length()) return false;


            char[] cs = s.toCharArray();
            char[] ct = t.toCharArray();
            int[] arrS = new int[127];
            int[] arrT = new int[127];

            for (int i = 0; i < cs.length; i++) {
                if (arrS[cs[i]] != arrT[ct[i]]) return false;
                arrS[cs[i]] = i + 1;
                arrT[ct[i]] = i + 1;
            }
            return true;


        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}