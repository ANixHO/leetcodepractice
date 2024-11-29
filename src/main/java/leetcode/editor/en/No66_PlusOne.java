package leetcode.editor.en;

public class No66_PlusOne {
    public static void main(String[] args) {
        Solution solution = new No66_PlusOne().new Solution();
    }

    /*
    [66]Plus One
    */
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] plusOne(int[] digits) {
            int carry = 0;
            int len = digits.length;

            int temp = digits[len - 1] + 1;
            digits[len - 1] = temp % 10;
            carry = temp / 10;

            if (carry == 0) return digits;

            for (int i = len - 2; i >= 0; i--) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                } else {
                    digits[i] += 1;
                    carry = 0;
                    break;
                }
            }

            if (carry == 0) return digits;

            int[] res = new int[len + 1];
            res[0] = 1;

            for (int i = 0; i < len; i++) {
                res[i+1] = digits[i];
            }
            return res;




        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}