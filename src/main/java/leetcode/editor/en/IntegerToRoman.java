package leetcode.editor.en;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman{
    public static void main(String[] args) {
        Solution solution = new IntegerToRoman().new Solution();
    }
// [12]Integer to Roman
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String intToRoman(int num) {
        int[] n = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] s = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n.length; i++) {
            while(num >= n[i]){
                num -= n[i];
                sb.append(s[i]);
            }
        }

        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}