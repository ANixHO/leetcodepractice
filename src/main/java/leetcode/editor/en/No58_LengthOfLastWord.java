package leetcode.editor.en;

public class No58_LengthOfLastWord {
    public static void main(String[] args) {
        Solution solution = new No58_LengthOfLastWord().new Solution();
        solution.lengthOfLastWord(" the moon  ");
    }

    // [58]Length of Last Word
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLastWord(String s) {
           int res = 0;
           char[] chars = s.toCharArray();

           for (int i = chars.length- 1 ; i >= 0; i--){
               char c = chars[i];
               if (c != ' ' ) res ++;
               else if (c == ' ' && res != 0) break;

           }
           return res;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}