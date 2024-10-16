package leetcode.editor.en;
public class RomanToInteger{
    public static void main(String[] args) {
        Solution solution = new RomanToInteger().new Solution();
        solution.romanToInt("LVIII");
    }
// [13]Roman to Integer
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int romanToInt(String s) {
        char[] chars = s.toCharArray();

        int res = 0;
        int prev = res;
        for (int i = chars.length - 1; i >= 0; i--) {

            int cur = switcher(chars[i]);

            if (cur < prev){
                res -= cur;
            } else {
                res += cur;

            }
            prev = cur;
        }

        return res;
    }

    private int switcher(char c){
        switch (c){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default:return 0;
        }
    }

}
//leetcode submit region end(Prohibit modification and deletion)
    	
}