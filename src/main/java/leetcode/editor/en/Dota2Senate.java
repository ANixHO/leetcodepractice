package leetcode.editor.en;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate{
    public static void main(String[] args) {
         Solution solution = new Dota2Senate().new Solution();
    }
// [649]Dota2 Senate
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String predictPartyVictory(String senate) {
        // best time complexity solution:
        return voting(senate.toCharArray(), 0);
    }

    // it is a recursive method, one round for one recursion
    // when there is no other type of chars, it wins
    private String voting(char[] chars, int vote){
        int r = 0;
        int d = 0;

        // variable int vote represents that
        // when it is positive, it means R wins for now
        // when it is negative, it means D wins for now
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'R') {

                if (vote >= 0) {
                    r ++;
                } else {
                    chars[i] = '0';
                }

                vote ++;

            } else if (chars[i] == 'D') {

                if (vote <= 0) {
                    d --;
                } else {
                    chars[i] = '0';
                }

                vote --;
            }
        }

        if (r != 0 && d == 0){
            return "Radiant";
        } else if (d != 0 && r == 0) {
            return "Dire";
        } else {
            return voting(chars, vote);
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}