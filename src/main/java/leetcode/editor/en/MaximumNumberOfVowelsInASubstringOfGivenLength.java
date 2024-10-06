package leetcode.editor.en;

import java.io.UnsupportedEncodingException;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public static void main(String[] args) {
        Solution solution = new MaximumNumberOfVowelsInASubstringOfGivenLength().new Solution();
        solution.maxVowels("leetcode",3);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxVowels(String s, int k)  {
            byte[] arr = new byte[123];
            byte[] str = s.getBytes();
            arr['a'] = arr['e'] = arr['i'] = arr['o'] = arr['u'] = 1;

            int left = 0;
            int right = 0;
            int maxV = 0;
            int curV = 0;

            while(right < k){
                maxV += arr[str[right++]];
            }

            curV = maxV;

            while(right < s.length()){
                curV += arr[str[right++]] - arr[str[left++]];
                if(curV > maxV) maxV = curV;
            }

            return maxV;

        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}