package leetcode.editor.en;

import java.util.Stack;

public class RemovingStarsFromAString {
    public static void main(String[] args) {
        Solution solution = new RemovingStarsFromAString().new Solution();
        solution.removeStars("leet**cod*e");
    }

    // [2390]Removing Stars From a String
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /*
            turn string into bytes
            iterate the byte[]
                when meet the * , count the number of it
            move letters which behind the star forward (number of '*' x 2)
         */
        public String removeStars(String s) {
            int stars = 0;
            byte[] bytes = s.getBytes();

            for (int i = 0; i < bytes.length; i++) {
                if (bytes[i] == '*'){
                    stars ++;
                } else {
                    bytes[i - stars * 2] = bytes[i];
                }
            }

            return new String(bytes,0,bytes.length - stars * 2);
        }
    }


    //leetcode submit region end(Prohibit modification and deletion)

}


