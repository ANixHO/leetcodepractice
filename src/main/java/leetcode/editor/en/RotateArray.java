package leetcode.editor.en;

public class RotateArray {
    public static void main(String[] args) {
        Solution solution = new RotateArray().new Solution();
        solution.rotate(new int[]{1,2,3,4,5,6,7}, 3);
    }

    // [189]Rotate Array
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void rotate(int[] nums, int k) {
            k %= nums.length;

            reserve(nums,0,nums.length -1);
            reserve(nums,0,k-1);
            reserve(nums,k,nums.length-1);

        }

        private void reserve(int[] nums, int start, int end){
            while (start < end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;

                start ++;
                end --;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
