  package leetcode.editor.en;
  public class No135_Candy{
      public static void main(String[] args) {
           Solution solution = new No135_Candy().new Solution();
      }
      // [135]Candy
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int candy(int[] ratings) {
        int peak = 0;
        int up = 0;
        int down = 0;
        int res = 1;

        for (int i = 0; i < ratings.length - 1; i++) {
            int curr = ratings[i + 1];
            int prev = ratings[i];

            if (curr > prev){
                down = 0;
                up++;
                peak = up;
                res+= up + 1;
            } else if (curr == prev){
                down = 0;
                up = 0;
                res ++;
            } else {
                up = 0;
                down++;
                res += down + 1;
                if (down < peak){
                    res--;
                }
            }
        }

        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }