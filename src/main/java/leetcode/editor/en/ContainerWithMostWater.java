package leetcode.editor.en;
public class ContainerWithMostWater{
    public static void main(String[] args) {
         Solution solution = new ContainerWithMostWater().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxArea(int[] height) {
        int h = 0;
        int res = 0;
        int left = 0;
        int right = height.length - 1;

        while (right > left ){
            int width = right - left;
            h = Math.min(height[left], height[right]);
            int cur = width * h;

            if (cur > res) res = cur;

            while(right > left && h >= height[left]){
                left ++;
            }

            while(right > left && h >= height[right]){
                right--;
            }
        }

        return res;


    }
}
//leetcode submit region end(Prohibit modification and deletion)

}