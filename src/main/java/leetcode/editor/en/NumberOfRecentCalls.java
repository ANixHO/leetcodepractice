package leetcode.editor.en;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class NumberOfRecentCalls {
    public static void main(String[] args) {
        RecentCounter solution = new NumberOfRecentCalls().new RecentCounter();
        int[] input = new int[]{0, 1, 100, 3001, 3002};
        for (int i : input){
            solution.ping(i);
        }
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class RecentCounter {
        private int request;
        private Queue<Integer> queue;

        public RecentCounter() {
            this.request = 0;
            this.queue = new LinkedList<Integer>();
        }

        public int ping(int t) {
            queue.add(t);
            this.request ++;

            while(t - queue.peek() > 3000){
                queue.remove();
                this.request -= 1;
            }

            return request;
        }
    }

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
//leetcode submit region end(Prohibit modification and deletion)

}