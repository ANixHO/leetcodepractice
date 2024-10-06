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
    public String voting(char[] senates, int vote){

        int r = 0;
        int d = 0;

        for (int i = 0; i < senates.length; i++) {
            if(senates[i] == 'R'){

                if (vote >= 0){
                    r++;
                } else {
                    senates[i] = '0';
                }
                vote ++;

            }else if (senates[i] == 'D'){

                if (vote <=0){
                    d ++;
                }else {
                    senates[i] = '0';
                }
                vote --;
            }
        }

        if (d !=0 && r == 0){
            return "Dire";
        }else if (d == 0 && r != 0){
            return "Radiant";
        } else {
            return voting(senates, vote);
        }

//        char[] chars = senate.toCharArray();
//        Queue<Character> que = new LinkedList<>();
//
//        for (char c : chars){
//            que.add(c);
//        }
//
//        int r = 0;
//        int d = 0;
//
//        while (que.size() > 1 ){
//            char c = que.poll();
//            if (c == 'R' && d > 0){
//                d--;
//            }else if (c == 'R' && d == 0){
//                r ++;
//                que.add(c);
//            }
//
//            if (c == 'D' && r > 0){
//                r --;
//            } else if (c == 'D' && r == 0){
//                d ++;
//                que.add(c);
//            }
//
//            if (r == que.size() || d == que.size()){
//                break;
//            }
//
//        }
//
//        if (que.peek() == 'R'){
//            return "Radiant";
//        } else {
//            return "Dire";
//        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}