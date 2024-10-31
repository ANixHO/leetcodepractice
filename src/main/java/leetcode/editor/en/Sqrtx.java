package leetcode.editor.en;
public class Sqrtx{
    public static void main(String[] args) {
        Solution solution = new Sqrtx().new Solution();
    }
// [69]Sqrt(x)
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        int left = 1;
        int right = x;

        while (right >= left) {
            int mid = (right + left) / 2;
            if (mid == x/mid) {
                return mid;
            } else if (mid > x / mid){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return right;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}