  package leetcode.editor.en;

  import java.util.ArrayList;
  import java.util.List;

  public class No6_ZigzagConversion{
      public static void main(String[] args) {
           Solution solution = new No6_ZigzagConversion().new Solution();
           solution.convert("PAYPALISHIRING",3);
      }
      // [6]Zigzag Conversion
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1) return s;

        int direction = 1;
        int curr = 0;
        List<StringBuilder> sbs = new ArrayList<>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < numRows; i ++){
            sbs.add(new StringBuilder());
        }

        for (char c: chars){
            sbs.get(curr).append(c);

            if (curr == 0) direction = 1;
            else if (curr == numRows - 1) direction = -1;

            curr = curr + direction;
        }

        String res = "";
        for (StringBuilder sb : sbs){
            res += sb.toString();
        }
        return res;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }