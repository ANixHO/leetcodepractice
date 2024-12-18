package leetcode.editor.en;

import java.util.*;

public class No49_GroupAnagrams {
    public static void main(String[] args) {
        Solution solution = new No49_GroupAnagrams().new Solution();
    }

    /*
    [49]Group Anagrams
    */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            // faster solution

            Map<String, List<String>> map = new HashMap<>();

            for (String str : strs) {
                char[] chars = str.toCharArray();
                Arrays.sort(chars);
                String sorted = new String(chars);

                if (!map.containsKey(sorted)) {
                    map.put(sorted, new ArrayList<>());
                }
                map.get(sorted).add(str);
            }

            return new ArrayList<>(map.values());


//        Map<Map<Character, Integer>, Integer> map = new HashMap<>();
//        List<List<String>> res = new ArrayList<>();
//
//        for (int i = 0; i < strs.length; i++) {
//            char[] curr = strs[i].toCharArray();
//            Map<Character, Integer> currMap = new HashMap<>();
//            for (int j = 0; j < curr.length; j++) {
//                currMap.put(curr[j], currMap.getOrDefault(curr[j], 0) + 1);
//            }
//            if (!map.containsKey(currMap)){
//                List<String> currList = new ArrayList<>();
//                currList.add(strs[i]);
//                res.add(currList);
//                map.put(currMap, res.size() - 1);
//            } else {
//                int index = map.get(currMap);
//                res.get(index).add(strs[i]);
//            }
//        }
//
//        return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}