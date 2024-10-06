package leetcode.editor.en;
public class MergeStringsAlternately{
    public static void main(String[] args) {
         Solution solution = new MergeStringsAlternately().new Solution();
    }
// [1768]Merge Strings Alternately
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();

        int len = Math.min(word1.length(), word2.length());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < len; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        if (n1 > n2){
            sb.append(word1.substring(len));
        } else if (n2 > n1){
            sb.append(word2.substring(len));
        }

        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}