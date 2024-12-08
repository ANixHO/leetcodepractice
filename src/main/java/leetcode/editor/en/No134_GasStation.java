  package leetcode.editor.en;
  public class No134_GasStation{
      public static void main(String[] args) {
           Solution solution = new No134_GasStation().new Solution();
      }
/* 
[134]Gas Station
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = 0;
        int start = 0;
        int totalGas = 0;
        int totalCost = 0;

        for (int i = 0; i < gas.length; i++) {
            totalCost += cost[i];
            totalGas += gas[i];
            tank += gas[i] - cost[i];

            if (tank < 0){
                start = i + 1;
                tank = 0;
            }

        }
        if (totalCost > totalGas)return -1;
        else return start;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }