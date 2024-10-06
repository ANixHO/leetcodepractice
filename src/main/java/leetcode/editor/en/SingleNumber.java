package leetcode.editor.en;
public class SingleNumber{
    public static void main(String[] args) {
         Solution solution = new SingleNumber().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i : nums){
            res ^= i;
        }

        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}