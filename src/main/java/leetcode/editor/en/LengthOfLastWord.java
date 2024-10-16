package leetcode.editor.en;
public class LengthOfLastWord{
    public static void main(String[] args) {
        Solution solution = new LengthOfLastWord().new Solution();
    }
// [58]Length of Last Word
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int res = 0;

        for (int i = chars.length - 1; i >= 0 ; i--) {
            if (chars[i] != ' '){
                res ++;
            }else if (chars[i] == ' ' && res != 0){
                break;
            }
        }

        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}