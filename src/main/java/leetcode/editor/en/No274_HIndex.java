  package leetcode.editor.en;

  import java.util.Arrays;

  public class No274_HIndex{
      public static void main(String[] args) {
           Solution solution = new No274_HIndex().new Solution();
      }
      // [274]H-Index
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);

        int n = citations.length;
        int res = 0;

        for (int i = 0; i < n; i++) {
            int h = n - i;
            if (citations[i] >= h) {
                res = h;
                break;
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }