  package leetcode.editor.en;
  public class No125_ValidPalindrome{
      public static void main(String[] args) {
           Solution solution = new No125_ValidPalindrome().new Solution();
           solution.isPalindrome("A man, a plan, a canal: Panama");
      }
/* 
[125]Valid Palindrome
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while(right > left){
            char lc = convertToLowercase(chars[left]);
            char rc = convertToLowercase(chars[right]);

            while(right > left && lc == ' '){
                lc = convertToLowercase(chars[++left]);
            }
            while (right > left && rc == ' ') {
                rc = convertToLowercase(chars[--right]);
            }
            if (lc != rc) return false;
            left ++;
            right--;
        }
        return true;
    }

    private boolean isLowerCase(char c){
        return (c >= 'a' && c <= 'z')  ;
    }
    private boolean isBiggerCase(char c){
        return c >= 'A' && c <= 'Z';
    }

    private boolean isNumber(char c){
        return c >= '0' && c <= '9';
    }

    private char convertToLowercase(char c){
        if (isLowerCase(c) || isNumber(c)){
            return c;
        } else if (isBiggerCase(c)){
            return (char)(c + 32);
        } else {
            return ' ';
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }