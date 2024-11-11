  package leetcode.editor.en;
  public class No125_ValidPalindrome{
      public static void main(String[] args) {
           Solution solution = new No125_ValidPalindrome().new Solution();
      }
      // [125]Valid Palindrome
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 1) return true;
        char[] chars = s.toCharArray();
        int rightLimit = chars.length - 1;
        int left =-1;
        int right = chars.length ;

        while(right > left){
            char lc = chars[++left];
            char rc = chars[--right];

            while (!isAlphanumeric(lc) && right > left){
                lc = chars[++left];
            }
            while(!isAlphanumeric(rc) && right > left){
                rc = chars[--right];
            }

            if (toLower(lc) != toLower(rc)) return false;

        }

        return true;
    }

    private char toLower(char c){
        if (c >=65 && c <=90) return (char) (c+32);
        else return c;
    }

    private boolean isAlphanumeric(char c){
        return (c>= 48 && c <= 57) || (c >=65 && c <=90) || (c >=97 && c <=122);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }