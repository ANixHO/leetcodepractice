package leetcode.editor.en;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        Solution solution = new UniqueNumberOfOccurrences().new Solution();
    }
    // [1207]Unique Number of Occurrences
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean uniqueOccurrences(int[] arr) {
            Map<Integer, Integer> map = new HashMap<>();

            for (int i : arr) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }

            Set<Integer> set = new HashSet<>();
            for (int i : map.values()) {
                if (set.contains(i)) {
                    return false;
                } else {
                    set.add(i);
                }
            }

            return true;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}