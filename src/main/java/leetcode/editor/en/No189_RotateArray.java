  package leetcode.editor.en;

  import java.util.Arrays;
  import java.util.Collections;

  public class No189_RotateArray{
      public static void main(String[] args) {
           Solution solution = new No189_RotateArray().new Solution();
      }
/* 
[189]Rotate Array
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;

        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length -1);

    }
    private void reverse(int[] nums, int start, int end){
        while(end > start) {
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start ++;
            end--;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }