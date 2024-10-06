package leetcode.editor.en;

public class MaxConsecutiveOnesIii {
    public static void main(String[] args) {
        Solution solution = new MaxConsecutiveOnesIii().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /*
            sliding window
            move the right pointer first until zero > k
            then move the left pointer until zero == k
            figure out whether it is the longest 1's
         */
        public int longestOnes(int[] nums, int k) {
            int zero = 0;

            int left = 0;
            int right = 0;

            int max1s = 0;


            for (; right < nums.length; right++) {

                if(nums[right] == 0) zero ++;

                while (zero > k){
                    if(nums[left] == 0){
                        zero --;
                    }
                    left ++;
                }

                max1s = Math.max(max1s, right - left + 1);
            }

            return max1s;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}