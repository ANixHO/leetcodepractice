package leetcode.editor.en;

import java.sql.Array;
import java.util.*;

public class DetermineIfTwoStringsAreClose {
    public static void main(String[] args) {
        Solution solution = new DetermineIfTwoStringsAreClose().new Solution();
    }

    // [1657]Determine if Two Strings Are Close
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean closeStrings(String word1, String word2) {
            /*
                both strings should have same number of letters
                and the  sum of each type of letters should be the same
             */

            if (word1.length() != word2.length()) return false;

            Map<Character, Integer> map1 = new HashMap<>();
            Map<Character, Integer> map2 = new HashMap<>();

            char[] c1 = word1.toCharArray();
            char[] c2 = word2.toCharArray();

            for (char c : c1){
                map1.put(c, map1.getOrDefault(c, 0) + 1);
            }

            for (char c: c2){
                map2.put(c, map2.getOrDefault(c, 0) + 1);
            }

            List<Integer> l1 = new ArrayList<>();
            List<Integer> l2 = new ArrayList<>();
            Set<Character> s1 = new HashSet<>();
            Set<Character> s2 = new HashSet<>();

            for (Map.Entry<Character, Integer> entry : map1.entrySet()){
                l1.add(entry.getValue());
                s1.add(entry.getKey());

            }
            for (Map.Entry<Character, Integer> entry : map2.entrySet()){
                l2.add(entry.getValue());
                s2.add(entry.getKey());
            }

            Collections.sort(l1);
            Collections.sort(l2);

            if (l1.equals(l2) && s1.equals(s2)){
                return true;
            } else {
                return false;
            }

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}