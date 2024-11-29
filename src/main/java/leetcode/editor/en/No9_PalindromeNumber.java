  package leetcode.editor.en;
  public class No9_PalindromeNumber{
      public static void main(String[] args) {
           Solution solution = new No9_PalindromeNumber().new Solution();
      }
/* 
[9]Palindrome Number
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
//        if (x >= 0 && x <= 9) return true;
        int reversed = 0;
        int original = x;

        while (original != 0){
            reversed = reversed * 10 + original % 10;
            original /= 10;
        }
        return x == reversed;
        /*
        String str = "" + x;
        char[] chars = str.toCharArray();

        if (chars.length == 1) return true;

        int left = 0;
        int right = chars.length - 1;

        while (right > left){
            if (chars[right--] != chars[left++]) return false;
        }
        return true;
        */
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }