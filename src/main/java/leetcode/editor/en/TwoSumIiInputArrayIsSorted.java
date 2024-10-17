package leetcode.editor.en;
public class TwoSumIiInputArrayIsSorted{
    public static void main(String[] args) {
        Solution solution = new TwoSumIiInputArrayIsSorted().new Solution();
    }
// [167]Two Sum II - Input Array Is Sorted
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while(numbers[left] + numbers[right] != target){
            if (numbers[left] + numbers[right] > target){
                right--;
            } else {
                left ++;
            }
        }

        return new int[]{++left, ++ right};
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}