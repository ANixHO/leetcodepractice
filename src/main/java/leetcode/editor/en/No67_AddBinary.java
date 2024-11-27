  package leetcode.editor.en;
  public class No67_AddBinary{
      public static void main(String[] args) {
           Solution solution = new No67_AddBinary().new Solution();
      }
/*
[67]Add Binary
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String addBinary(String a, String b) {
        char[] ca = a.toCharArray();
        char[] cb = b.toCharArray();

        int i = ca.length - 1;
        int j = cb.length - 1;
        int carry = 0;

        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || carry ==1){
            if (i >= 0) carry += ca[i--] - '0';
            if (j >= 0) carry += cb[j--] - '0';
            sb.append(carry % 2);
            carry /= 2;
        }

        return sb.reverse().toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }