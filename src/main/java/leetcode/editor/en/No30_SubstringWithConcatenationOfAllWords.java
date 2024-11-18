package leetcode.editor.en;

import java.util.*;

public class No30_SubstringWithConcatenationOfAllWords {
    public static void main(String[] args) {
        Solution solution = new No30_SubstringWithConcatenationOfAllWords().new Solution();
        solution.findSubstring("lingmindraboofooowingdingbarrwingmonkeypoundcake", new String[]{"fooo","barr","wing","ding","wing"});
    }

    /*
    [30]Substring with Concatenation of All Words
    */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> findSubstring(String s, String[] words) {
            int wordLen = words[0].length();
            int len = words.length;
            int left = 0;
            int right = wordLen ;

            if (s.length() < wordLen * len) return new ArrayList<>();

            Map<String, Integer> map = new HashMap<>();
            List<Integer> res = new ArrayList<>();

            for (int i = 0; i < len; i++) {
                map.put(words[i], map.getOrDefault(words[i], 0) + 1);
            }

            while (right < (s.length()-wordLen * (len - 1) + 1)) {
                String curr = s.substring(left, right);
                if (map.containsKey(curr)) {

                    Map<String, Integer> currMap= new HashMap<>();
                    for (int i = 0; i < len; i++) {
                        curr = s.substring(left + i*wordLen, right + i*wordLen);
                        currMap.put(curr,currMap.getOrDefault(curr, 0)+1);
                    }
                    if (currMap.equals(map)) res.add(left);
                }

                left ++;
                right ++;
            }

            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}