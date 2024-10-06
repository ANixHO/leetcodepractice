package leetcode.editor.en;


import java.util.Stack;

public class OnlineStockSpan {
    public static void main(String[] args) {

    }

    // [901]Online Stock Span
//leetcode submit region begin(Prohibit modification and deletion)
    class StockSpanner {
        private Stack<int[]> stack;

        public StockSpanner() {
            stack = new Stack<>();
        }

        public int next(int price) {
            int span = 1;
            while (!stack.isEmpty() && stack.peek()[0] <= price){
                span += stack.pop()[1];
            }

            stack.push(new int[]{price, span});

            return span;

        }
    }

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
//leetcode submit region end(Prohibit modification and deletion)

}