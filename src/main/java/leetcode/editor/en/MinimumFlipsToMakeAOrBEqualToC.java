package leetcode.editor.en;

public class MinimumFlipsToMakeAOrBEqualToC {
    public static void main(String[] args) {
        Solution solution = new MinimumFlipsToMakeAOrBEqualToC().new Solution();
    }

    // [1318]Minimum Flips to Make a OR b Equal to c
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minFlips(int a, int b, int c) {
            int flips = 0;

            while(a != 0 || b != 0 || c != 0 ){
                int lsba = a & 1;
                int lsbb = b & 1;
                int lsbc = c & 1;

                if (lsbc == 1){
                    if (lsba == 0 && lsbb == 0){
                        flips ++;
                    }
                } else {
                    flips += lsba + lsbb;
                }

                a >>= 1;
                b >>= 1;
                c >>= 1;
            }

            return flips;


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}