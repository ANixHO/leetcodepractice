  package leetcode.editor.en;

  import java.util.HashSet;
  import java.util.Set;

  public class No202_HappyNumber{
      public static void main(String[] args) {
           Solution solution = new No202_HappyNumber().new Solution();
      }
/* 
[202]Happy Number
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(!set.contains(n)){
            if (n == 1) return true;
            set.add(n);
            n = helper(n);
        }
        return false;
    }

    private int helper(int n){
        int sum = 0;
        while (n != 0){
            int ones = n % 10;
            sum += ones * ones;
            n /= 10;
        }
        return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }