  package leetcode.editor.en;
  public class No167_TwoSumIiInputArrayIsSorted{
      public static void main(String[] args) {
           Solution solution = new No167_TwoSumIiInputArrayIsSorted().new Solution();
      }
/* 
[167]Two Sum II - Input Array Is Sorted
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length -1;

        for (int i = 0; i < numbers.length; i++) {
            int sum = numbers[left] + numbers[right];
            if (sum > target) right--;
            else if (sum < target) left ++;
            else return new int[]{++left, ++right};
        }
        return new int[2];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }