package leetcode.editor.en;

public class RemoveDuplicatesFromSortedArrayIi {
    public static void main(String[] args) {
        Solution solution = new RemoveDuplicatesFromSortedArrayIi().new Solution();
    }

    // [80]Remove Duplicates from Sorted Array II
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums.length <= 2) return nums.length;

            int index = 2;

            for (int i = 2; i < nums.length; i++) {
                if (nums[i] != nums[index - 2]){
                    nums[index] = nums[i];
                    index++;
                }
            }

            return index;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}