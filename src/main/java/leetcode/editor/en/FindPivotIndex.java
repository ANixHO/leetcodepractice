package leetcode.editor.en;

public class FindPivotIndex {
    public static void main(String[] args) {
        Solution solution = new FindPivotIndex().new Solution();
        solution.pivotIndex(new int[]{1,7,3,6,5,6});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int pivotIndex(int[] nums) {
            int leftsum = 0;
            int rightsum = 0;

            for (int num : nums){
                rightsum += num;
            }

            for (int i = 0; i < nums.length; i++) {
                rightsum -=nums[i];
                if(i != 0) leftsum += nums[i - 1];

                if (rightsum == leftsum) return i;
            }

            return -1;
















//            int result = -1;
//            int leftSum = 0;
//            int rightSum = 0;
//
//            for (int num : nums) {
//                rightSum += num;
//            }
//
//            rightSum -= nums[0];
//
//            if (leftSum == rightSum) {
//                result = 0;
//            } else {
//                for (int i = 1; i < nums.length; i++) {
//                    rightSum -= nums[i];
//                    leftSum += nums[i - 1];
//
//                    if (leftSum == rightSum){
//                        result = i;
//                        break;
//                    }
//                }
//
//            }
//
//            return result;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}