package leetcode.editor.en;

import java.util.HashMap;
import java.util.Map;

public class No3_LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Solution solution = new No3_LongestSubstringWithoutRepeatingCharacters().new Solution();
    }

    // [3]Longest Substring Without Repeating Characters
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int curr = 0;
            int res = 0;
            int position = 0;

            Map<Character, Integer> map = new HashMap<>();
            char[] chars = s.toCharArray();

            for (int i = 0; i < chars.length; i++) {
                if (map.containsKey(chars[i]) && map.get(chars[i]) >= position){
                    curr = i - map.get(chars[i]);
                    position = map.get(chars[i]);
                } else {
                    curr++;
                }

                map.put(chars[i], i);
                res = Math.max(curr, res);
            }

            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}