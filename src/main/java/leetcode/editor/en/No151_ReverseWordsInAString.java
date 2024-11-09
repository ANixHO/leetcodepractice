package leetcode.editor.en;

public class No151_ReverseWordsInAString {
    public static void main(String[] args) {
        Solution solution = new No151_ReverseWordsInAString().new Solution();
        solution.reverseWords("  hello world  ");
    }

    // [151]Reverse Words in a String
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String reverseWords(String s) {
            String[] strs = s.split(" ");
            StringBuilder sb = new StringBuilder();
            for (int i = strs.length - 1; i >= 0; i--) {
                if (strs[i] != "") {
                    sb.append(strs[i] + " ");
                }
            }

            return sb.substring(0, sb.length() - 1);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}