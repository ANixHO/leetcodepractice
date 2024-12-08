  package leetcode.editor.en;

  import java.util.Arrays;

  public class No274_HIndex{
      public static void main(String[] args) {
           Solution solution = new No274_HIndex().new Solution();
      }
/* 
[274]H-Index
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= citations.length - i){
                return citations.length-i;
            }
        }
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }