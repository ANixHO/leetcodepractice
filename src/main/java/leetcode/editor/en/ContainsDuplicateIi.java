package leetcode.editor.en;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateIi{
    public static void main(String[] args) {
        Solution solution = new ContainsDuplicateIi().new Solution();
    }
// [219]Contains Duplicate II
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k){
                return true;
            }

            map.put(nums[i], i);
        }

        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}