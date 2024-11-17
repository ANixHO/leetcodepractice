package leetcode.editor.en;

import java.util.ArrayList;
import java.util.List;

public class No155_MinStack {
    public static void main(String[] args) {
        Solution solution = new No155_MinStack().new Solution();
    }

    /*
    [155]Min Stack
    */
    //leetcode submit region begin(Prohibit modification and deletion)
    class MinStack {
        List<Integer> list;
        List<Integer> min;

        public MinStack() {
            list = new ArrayList<>();
            min = new ArrayList<>();
        }

        public void push(int val) {
            list.add(val);
            if (min.isEmpty()){
                min.add(val);
            } else {
                min.add(Math.min(min.get(min.size() - 1), val));
            }
        }

        public void pop() {
            list.remove(list.size() - 1);
            min.remove(min.size() - 1);
        }

        public int top() {
            return list.get(list.size()-1);
        }

        public int getMin() {
            return min.get(min.size()-1);
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