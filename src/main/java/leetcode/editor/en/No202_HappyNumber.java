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
        int slow = n;
        int fast = hasNext(n);
        while(fast != 1 && fast != slow){
            slow = hasNext(slow);
            fast = hasNext(hasNext(fast));
        }
        return fast == 1;
    }

    private int hasNext(int n){
        int next = 0;
        while(n > 0) {
            int i = n % 10;
            next += i * i;
            n /= 10;
        }
        return next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }