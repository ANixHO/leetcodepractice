  package leetcode.editor.en;
  public class No80_RemoveDuplicatesFromSortedArrayIi{
      public static void main(String[] args) {
           Solution solution = new No80_RemoveDuplicatesFromSortedArrayIi().new Solution();
      }
/* 
[80]Remove Duplicates from Sorted Array II
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) return 1;
        int index =2;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[index - 2]){
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }