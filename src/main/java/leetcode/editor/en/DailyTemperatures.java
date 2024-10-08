package leetcode.editor.en;

import java.util.Stack;

public class DailyTemperatures{
    public static void main(String[] args) {
         Solution solution = new DailyTemperatures().new Solution();
    }
// [739]Daily Temperatures
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] >temperatures[stack.peek()]){
                int index = stack.pop();
                res[index] = i - index;
            }

            stack.push(i);
        }

        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}