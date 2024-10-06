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
// solution 1
            /*
            char[] char1 = word1.toCharArray();
            char[] char2 = word2.toCharArray();

            if (char1.length != char2.length) return false;

            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();

            Map<Character, Integer> map1 = new HashMap<>();
            Map<Character, Integer> map2 = new HashMap<>();

            Set<Character> set1 = new HashSet<>();
            Set<Character> set2 = new HashSet<>();

            for (int i = 0; i < char1.length; i++) {
                map1.put(char1[i], map1.getOrDefault(char1[i], 0) + 1);
                map2.put(char2[i], map2.getOrDefault(char2[i], 0) + 1);
            }

            for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
                set1.add(entry.getKey());
                list1.add(entry.getValue());
            }

            for (Map.Entry<Character, Integer> entry : map2.entrySet()) {
                set2.add(entry.getKey());
                list2.add(entry.getValue());
            }

            Collections.sort(list1);
            Collections.sort(list2);

            if (list1.equals(list2) && set1.equals(set2))
                return true;
            else
                return false;

             */
// solution 2

            int[] arr1 = new int[26];
            int[] arr2 = new int[26];

            for (char c : word1.toCharArray()) arr1[c - 'a'] ++;
            for (char c : word2.toCharArray()) arr2[c - 'a'] ++;

            for (int i = 0; i < 26; i++) {
                if ((arr1[i] == 0 && arr2[i] !=0) || (arr1[i] != 0 && arr2[i] == 0)) return false;

                int x = arr1[i];
                int y = arr2[i];

                for (int j = i + 1; j < 26; j++) {
                    if (arr1[j] == y){
                        arr1[i] = y;
                        arr1[j] = x;
                        break;
                    }
                }
            }

            for (int i = 0; i < 26; i++) {
                if (arr1[i] != arr2[i]) return false;
            }
            return true;


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}