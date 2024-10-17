package leetcode.editor.en;

public class ValidPalindrome {
    public static void main(String[] args) {
        Solution solution = new ValidPalindrome().new Solution();
        solution.isPalindrome(".,");
    }

    // [125]Valid Palindrome
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isPalindrome(String s) {
            if (s.length() == 1) return true;

            char[] chars = s.toCharArray();
            int left = 0;
            int right = chars.length - 1;

            while (right > left) {
                while (!isAlphabet(chars[left]) && !isNumber(chars[left] ) && right > left) {
                    left++;
                }
                while (!isAlphabet(chars[right]) && !isNumber(chars[right]) && right > left) {
                    right--;
                }

                if (!isSameLetter(chars[left], chars[right])) {
                    return false;
                }
                left++;
                right--;
            }

            return true;

        }

        private boolean isAlphabet(char c) {
            return isLowercaseLetter(c) || isUppercaseLetter(c);
        }

        private boolean isNumber(char c) {
            return c >= 48 && c <= 57;
        }

        private boolean isUppercaseLetter(char c) {
            return c >= 65 && c <= 90;
        }

        private boolean isLowercaseLetter(char c) {
            return c >= 97 && c <= 122;
        }

        private boolean isSameLetter(char c1, char c2) {
            if (isUppercaseLetter(c1)) c1 += 32;
            if (isUppercaseLetter(c2)) c2 += 32;
            return c1 == c2;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}