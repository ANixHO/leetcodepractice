package leetcode.editor.en;

import java.util.ArrayList;
import java.util.List;

public class MinStack {
    public static void main(String[] args) {
    }

    // [155]Min Stack
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        private List<Integer> list;
        private List<Integer> minList;
        private int size;

        public Solution() {
            list = new ArrayList<>();
            minList = new ArrayList<>();
            size = 0;
        }

        public void push(int val) {
            list.add(val);

            if (size == 0){
                minList.add(val);
            } else {
                minList.add(Math.min(val, minList.get(size - 1)));
            }

            size++;
        }

        public void pop() {
            list.remove(size - 1);
            minList.remove(size - 1);
            size--;

        }

        public int top() {
            return list.get(size - 1);

        }

        public int getMin() {
            return minList.get(size - 1);

        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
//leetcode submit region end(Prohibit modification and deletion)

}