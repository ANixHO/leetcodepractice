package leetcode.editor.en;
public class FindTheIndexOfTheFirstOccurrenceInAString{
    public static void main(String[] args) {
        Solution solution = new FindTheIndexOfTheFirstOccurrenceInAString().new Solution();
        solution.strStr("leetcode", "leeto");
    }
// [28]Find the Index of the First Occurrence in a String
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) return -1;

        char[] chars1 = haystack.toCharArray();
        char[] chars2 = needle.toCharArray();

        int res = -1;

        for (int i = 0; i <= chars1.length - chars2.length; i++) {
            if (chars1[i] == chars2[0]){
                for (int j = 0; j < chars2.length; j++) {
                    if (chars1[i+j] != chars2[j] ){
                        res = -1;
                        break;
                    }
                    res = i;
                }

                if (res != -1) return res;

            }
        }

        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}