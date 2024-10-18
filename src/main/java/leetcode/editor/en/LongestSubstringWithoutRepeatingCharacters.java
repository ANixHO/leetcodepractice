package leetcode.editor.en;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters{
    public static void main(String[] args) {
        Solution solution = new LongestSubstringWithoutRepeatingCharacters().new Solution();
    }
// [3]Longest Substring Without Repeating Characters
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
       int res = 0;
       int cur = 0; // current length of the longest substring
       int position = 0;

       Map<Character, Integer> map = new HashMap<>();
       char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            // if the char at i index is already in the map
            // it means it is duplicated character
            // and if the index of that char is equal or bigger than position
            // which is the index of previous duplicated char
            // need to recount the current sub length from this duplicated char
            // and reassign the index of this duplicated char as position field
            if (map.containsKey(chars[i])
                && map.get(chars[i]) >= position){
                cur = i - map.get(chars[i]);
                position = map.get(chars[i]);
            } else {
                cur ++;
            }

            map.put(chars[i], i);
            res = Math.max(res, cur);
        }

        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}