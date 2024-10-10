package leetcode.editor.en;

import java.io.UnsupportedEncodingException;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public static void main(String[] args) {
        Solution solution = new MaximumNumberOfVowelsInASubstringOfGivenLength().new Solution();
        solution.maxVowels("leetcode",3);
    }

    // [1456] Maximum Number of Vowels in A Substring of Given Length
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxVowels(String s, int k)  {
            int max = 0;
            int cur = 0;
            int left = 0;
            int right = k;

            char[] chars = s.toCharArray();

            for (int i = 0; i < k; i++) {
                if (isVowel(chars[i])){
                    cur++;
                }
            }

            max = cur;

            while (right < chars.length) {
                if (isVowel(chars[right])) {
                    cur++;
                }
                if (isVowel(chars[left])) {
                    cur--;
                }

                if (max < cur) max = cur;

                left ++;
                right++;
            }


            return max;
        }

        private boolean isVowel(char c){
            return c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u';
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}