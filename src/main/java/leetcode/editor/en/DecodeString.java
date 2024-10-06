package leetcode.editor.en;

import java.util.Stack;

public class DecodeString{
    public static void main(String[] args) {
         Solution solution = new DecodeString().new Solution();
         solution.decodeString("3[a]2[bc]");
    }
// [394]Decode String
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String decodeString(String s) {
        char[] chars = s.toCharArray();
        int n = 0;
        StringBuilder curSb = new StringBuilder();
        Stack<Integer> stkN = new Stack<>();
        Stack<StringBuilder> stkSb = new Stack<>();

        for(char c : chars){
            if (Character.isDigit(c)){
                n = n * 10 + (c - '0');

            } else if (c == '['){
                stkN.add(n);
                n = 0;
                stkSb.add(curSb);
                curSb = new StringBuilder();

            } else if (c == ']') {
                int tempN = stkN.pop();
                StringBuilder tempSb = curSb;
                curSb = stkSb.pop();

                while (tempN-- > 0) curSb.append(tempSb);

            }else {
                curSb.append(c);
            }
        }

        return curSb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}