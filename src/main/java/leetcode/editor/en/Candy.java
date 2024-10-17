package leetcode.editor.en;
public class Candy{
    public static void main(String[] args) {
        Solution solution = new Candy().new Solution();
    }
// [135]Candy
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int candy(int[] ratings) {
        if (ratings.length == 0) return 0;

        int res = 1;
        int up = 0;
        int down = 0;
        int peak = 0;

        for (int i = 0; i < ratings.length - 1; i++) {
            int cur = ratings[i + 1];
            int prev = ratings[i];

            if (cur > prev){
                down = 0;
                up ++;
                peak = up;
                res += up + 1;
            } else if (cur == prev){
                up = 0;
                peak = 0;
                down = 0;
                res ++;
            } else {
                up = 0;
                down ++;
                res += down + 1;
                if (down <= peak){
                    res --;
                }
            }
        }

        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}