package leetcode.editor.en;
public class RemoveDuplicatesFromSortedArray{
    public static void main(String[] args) {
         Solution solution = new RemoveDuplicatesFromSortedArray().new Solution();
    }
// [26]Remove Duplicates from Sorted Array
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeDuplicates(int[] nums) {
       int index = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]){
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}