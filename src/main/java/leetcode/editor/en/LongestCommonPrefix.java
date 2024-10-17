package leetcode.editor.en;
public class LongestCommonPrefix{
    public static void main(String[] args) {
        Solution solution = new LongestCommonPrefix().new Solution();
    }
// [14]Longest Common Prefix
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();

        int len = 201;
        char[][] charsArr = new char[strs.length][];

        for (int i = 0; i < strs.length; i++) {
            charsArr[i] = strs[i].toCharArray();
            if (charsArr[i].length < len){
                len = charsArr[i].length;
            }
        }

        for (int i = 0; i < len; i++) {
            char c = charsArr[0][i];

            for (char[] chars : charsArr){
                if (chars[i] != c){
                    return sb.toString();
                }
            }

            sb.append(c);
        }

        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}