  package leetcode.editor.en;
  public class No28_FindTheIndexOfTheFirstOccurrenceInAString{
      public static void main(String[] args) {
           Solution solution = new No28_FindTheIndexOfTheFirstOccurrenceInAString().new Solution();
           solution.strStr("a", "a");
      }
/* 
[28]Find the Index of the First Occurrence in a String
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) return -1;
        char[] chars = haystack.toCharArray();
        char[] needles = needle.toCharArray();

        for (int i = 0; i < chars.length - needles.length + 1; i++) {
            if (chars[i] == needles[0]){
                int index = 0;
                while(index <needles.length){
                    if (chars[i+index] != needles[index]){
                        break;
                    } else if (index == needles.length-1){
                        return i;
                    }
                    index ++;
                }
            }
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }