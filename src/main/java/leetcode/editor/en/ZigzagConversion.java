package leetcode.editor.en;

public class ZigzagConversion {
    public static void main(String[] args) {
        Solution solution = new ZigzagConversion().new Solution();
    }

    // [6]Zigzag Conversion
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String convert(String s, int numRows) {
            if (numRows == 1) return s;

            int direction = 1;
            int index = 0;
            char[] chars = s.toCharArray();
            StringBuilder[] sbs = new StringBuilder[numRows];

            for (int i = 0; i < numRows; i++) {
                sbs[i] = new StringBuilder();
            }

            for (int i = 0; i < chars.length; i++) {
                sbs[index].append(chars[i]);

                if (index + 1 == numRows)
                    direction = -1;
                else if (index + 1 == 1)
                    direction = 1;


                index += direction;
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