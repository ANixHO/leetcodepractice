package leetcode.editor.en;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static void main(String[] args) {
        Solution solution = new Combinations().new Solution();
    }

    // [77]Combinations
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> res;
        int n;
        int k;

        public List<List<Integer>> combine(int n, int k) {
            this.res = new ArrayList<>();
            this.n = n;
            this.k = k;
            backtrack(1, new ArrayList<>());
            return res;
        }

        private void backtrack(int start, List<Integer> comb){
            if (comb.size() == k) {
                res.add(new ArrayList<>(comb));
                return;
            }

            for (; start <=n; start++){
                comb.add(start);
                backtrack(start + 1, comb);
                comb.remove(comb.size() - 1);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}