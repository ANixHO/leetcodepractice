package leetcode.editor.en;

public class No14_LongestCommonPrefix {
    public static void main(String[] args) {
        Solution solution = new No14_LongestCommonPrefix().new Solution();
    }

    // [14]Longest Common Prefix
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestCommonPrefix(String[] strs) {

            String prefix = strs[0];
            for (int i = 0; i < strs.length; i++) {
                while (!strs[i].startsWith(prefix)){
                    prefix = prefix.substring(0, prefix.length() - 1);
                    if (prefix.isEmpty()) return "";
                }
            }

            return prefix;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}