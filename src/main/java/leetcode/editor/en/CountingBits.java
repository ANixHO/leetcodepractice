package leetcode.editor.en;

import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
        Solution solution = new CountingBits().new Solution();
        int[] arr = solution.countBits(100);


        System.out.println(Arrays.toString(arr));

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] countBits(int n) {
            int[] arr = new int[n + 1];
            numOfOne(arr, 1, 1);
            return arr;
        }

        void numOfOne(int[] dp, int index, int ones) {
            if (index >= dp.length) return;
            dp[index] = ones;

            numOfOne(dp, index * 2, ones);
            numOfOne(dp, index * 2 + 1, ones + 1);
        }



    }
//leetcode submit region end(Prohibit modification and deletion)

}