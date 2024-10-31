package leetcode.editor.en;

public class AddBinary {
    public static void main(String[] args) {
        Solution solution = new AddBinary().new Solution();
    }

    // [67]Add Binary
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String addBinary(String a, String b) {
            int i = a.length() - 1;
            int j = b.length() - 1;
            int carry = 0;

            StringBuilder sb = new StringBuilder();
            while (i >= 0 || j >= 0 || carry == 1) {
                if (i >= 0) carry += a.charAt(i--) - '0';
                if (j >= 0) carry += b.charAt(j--) - '0';
                sb.append(carry % 2);
                carry /= 2;
            }

            return sb.reverse().toString();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}