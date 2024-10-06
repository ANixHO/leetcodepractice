package leetcode.editor.en;

import java.util.Arrays;

public class CanPlaceFlowers{
    public static void main(String[] args) {
         Solution solution = new CanPlaceFlowers().new Solution();
         solution.canPlaceFlowers(new int[]{0,0,1,0,0}, 1);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int i = 0;

        while(i < len && n > 0){

            if (flowerbed[i] == 1){
                i += 2;
            }else if (i == len - 1 || flowerbed[i + 1] == 0){
                n --;
                flowerbed[i] = 1;
            } else {
                i += 3;
            }
        }

        return n <= 0;


    }
}
//leetcode submit region end(Prohibit modification and deletion)

}