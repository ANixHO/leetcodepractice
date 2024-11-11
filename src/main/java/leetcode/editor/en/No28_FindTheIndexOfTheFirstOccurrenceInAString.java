  package leetcode.editor.en;
  public class No28_FindTheIndexOfTheFirstOccurrenceInAString{
      public static void main(String[] args) {
           Solution solution = new No28_FindTheIndexOfTheFirstOccurrenceInAString().new Solution();
      }
      // [28]Find the Index of the First Occurrence in a String
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length() ) return -1;

        char[] chars1 = haystack.toCharArray();
        char[] chars2 = needle.toCharArray();

        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (chars1[i] == chars2[0]){

                for (int j = 0; j < chars2.length; j++) {
                    if (chars1[i+j] != chars2[j]) break;
                    else if (j==chars2.length-1) return i;
                }
            }
        }

        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }