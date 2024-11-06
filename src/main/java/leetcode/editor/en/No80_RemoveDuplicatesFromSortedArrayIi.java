  package leetcode.editor.en;
  public class No80_RemoveDuplicatesFromSortedArrayIi{
      public static void main(String[] args) {
           Solution solution = new No80_RemoveDuplicatesFromSortedArrayIi().new Solution();
      }
      // [80]Remove Duplicates from Sorted Array II
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        boolean flg = false;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i-1]){
                flg = false;
                left++;
            } else if (!flg && nums[i] == nums[i-1]){
                flg = true;
                left++;
            }

            nums[left] = nums[i];


        }
        return ++left;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }