package leetcode.editor.en;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies{
    public static void main(String[] args) {
         Solution solution = new KidsWithTheGreatestNumberOfCandies().new Solution();
    }
// [1431]Kids With the Greatest Number of Candies
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max = 0;

        for (int candy : candies){
            if (candy > max) max = candy;
        }

        for (int candy : candies){
            if (candy + extraCandies >= max) {
                res.add(true);
            } else {
                res.add(false);
            }
        }

        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}