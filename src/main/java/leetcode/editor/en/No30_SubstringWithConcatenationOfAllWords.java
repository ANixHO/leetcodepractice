package leetcode.editor.en;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class No30_SubstringWithConcatenationOfAllWords {
    public static void main(String[] args) {
        Solution solution = new No30_SubstringWithConcatenationOfAllWords().new Solution();
    }

    /*
    [30]Substring with Concatenation of All Words
    */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> findSubstring(String s, String[] words) {
            int wordLen = words[0].length();
            int word = 0;
            int arrLen = words.length;
            int left = 0;
            int right = wordLen;

            if (s.length() < wordLen * arrLen) return new ArrayList<>();

            List<Integer> res = new ArrayList<>();

            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < arrLen; i++) {
                map.put(words[i], map.getOrDefault(words[i], 0) + 1);
            }

            while (right < s.length() - wordLen * (arrLen - 1) + 1) {

                if (map.containsKey(s.substring(left, right))) {
                    Map<String, Integer> currMap = new HashMap<>();

                    for (int i = 0; i < arrLen; i++) {
                        String curr = s.substring(left + i * wordLen, right + i * wordLen);
                        currMap.put(curr, currMap.getOrDefault(curr, 0) + 1);
                    }

                    if (currMap.equals(map)) {
                        res.add(left);
                    }
                }
                left++;
                right++;
            }
            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}