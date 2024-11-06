  package leetcode.editor.en;
  public class No189_RotateArray{
      public static void main(String[] args) {
           Solution solution = new No189_RotateArray().new Solution();
      }
      // [189]Rotate Array
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        int[] temp = new int[k];
        int index = nums.length - k - 1;

        for (int i = 0; i < k; i++) {
            temp[i] = nums[nums.length - k + i];
        }

        while ( index >=0){
            nums[index + k] = nums[index];
            index--;
        }

        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }