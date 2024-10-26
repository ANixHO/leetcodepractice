package leetcode.editor.en;
public class PalindromeNumber{
    public static void main(String[] args) {
        Solution solution = new PalindromeNumber().new Solution();
    }
// [9]Palindrome Number
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        char[] chars = String.valueOf(x).toCharArray();
        int len = chars.length;
        for (int i = 0; i < len / 2; i++) {
            if (chars[i] != chars[len - i - 1]) return false;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}