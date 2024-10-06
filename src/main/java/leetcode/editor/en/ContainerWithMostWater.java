package leetcode.editor.en;
public class ContainerWithMostWater{
    public static void main(String[] args) {
         Solution solution = new ContainerWithMostWater().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int leftB = 0;
        int rightB = height.length - 1;

        while(leftB < rightB){
            int cur = (rightB - leftB) * (Math.min(height[leftB], height[rightB]));
            max = Math.max(max, cur);

            if(height[leftB] > height[rightB]){
                rightB --;
            }else{
                leftB ++;
            }
        }
        return max;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}