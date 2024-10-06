package leetcode.editor.en;

import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        Solution solution = new AsteroidCollision().new Solution();
        solution.asteroidCollision(new int[]{5, 10, -5});
    }

    // [735]Asteroid Collision
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] asteroidCollision(int[] asteroids) {
        /*
            use stack
            mainly consider two kinds of situation that positive number or negative number
         */
            Stack<Integer> stack = new Stack<>();

            for (int cur : asteroids) {
                if (stack.isEmpty()) {
                    stack.push(cur);
                } else {
                    checkCollision(cur, stack);
                }
            }

            int[] res = new int[stack.size()];
            for (int i = stack.size() - 1; i >= 0 ; i--) {
                res[i] = stack.pop();
            }

            return res;

        }

        private void checkCollision(int cur, Stack<Integer> stack){
            int prev = stack.peek();
            if (cur < 0 && prev > 0){
                if (Math.abs(cur) == Math.abs(prev)){
                    stack.pop();
                } else if (Math.abs(cur) > Math.abs(prev)){
                    stack.pop();
                    if (stack.isEmpty()){
                        stack.push(cur);

                    }else {
                        checkCollision(cur, stack);
                    }
                }
            } else {
                stack.push(cur);
            }
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}