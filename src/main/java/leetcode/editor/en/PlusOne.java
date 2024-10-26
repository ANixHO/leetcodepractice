package leetcode.editor.en;

import java.util.Arrays;

public class PlusOne{
    public static void main(String[] args) {
        Solution solution = new PlusOne().new Solution();
        solution.plusOne(new int[]{9});
    }
// [66]Plus One
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] != 9){
            digits[digits.length-1] += 1;
            return digits;
        }

        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] == 9){
                if (i == 0){
                    digits = new int[len + 1];
                    digits[0] = 1;
                    Arrays.fill(digits,1,len,0);
                } else {
                    digits[i] = 0;
                }
            } else {
                digits[i] += 1;
                break;
            }
        }

        return digits;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}