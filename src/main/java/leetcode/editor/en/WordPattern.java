package leetcode.editor.en;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern {
    public static void main(String[] args) {
        Solution solution = new WordPattern().new Solution();
    }

    // [290]Word Pattern
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean wordPattern(String pattern, String s) {
            Map<Character, String> map = new HashMap<>();
            Set<String> set = new HashSet<>();

            char[] chars = pattern.toCharArray();
            String[] str = s.split(" ");

            if (chars.length != str.length) return false;

            for (int i = 0; i < chars.length; i++) {
                if (map.containsKey(chars[i]) && !str[i].equals(map.get(chars[i]))) {
                    return false;

                } else if (!map.containsKey(chars[i]) && set.contains(str[i])) {
                    return false;

                } else if (!map.containsKey(chars[i]) && !str[i].equals(map.get(chars[i]))){
                    map.put(chars[i], str[i]);
                    set.add(str[i]);
                }
            }

            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}