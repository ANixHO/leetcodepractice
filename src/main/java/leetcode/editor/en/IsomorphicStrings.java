package leetcode.editor.en;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings{
    public static void main(String[] args) {
        Solution solution = new IsomorphicStrings().new Solution();
    }
// [205]Isomorphic Strings
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] arrS = new int[200];
        int[] arrT = new int[200];

        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            if (arrS[s.charAt(i)] != arrT[t.charAt(i)]) return false;

            arrS[s.charAt(i)] = i + 1;
            arrT[t.charAt(i)] = i + 1;
        }

        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}