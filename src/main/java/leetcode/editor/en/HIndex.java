package leetcode.editor.en;

import java.util.Arrays;

public class HIndex{
    public static void main(String[] args) {
        Solution solution = new HIndex().new Solution();
    }
// [274]H-Index
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int hIndex(int[] citations) {
        int hindex = 0;
        int n = citations.length;

        Arrays.sort(citations);

        // the citations array is sorted by increased order
        // so the numbers after citations[i] must bigger than citations[i]
        // so I just need to compare citations[i] and h which equals to (n - i)


        for (int i = 0; i < n; i++) {
            int h = n - i;
            if (citations[i] >= h) {
                hindex = h;
                break;
            }
        }

        return hindex;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}