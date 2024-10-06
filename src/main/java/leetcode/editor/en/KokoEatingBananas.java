package leetcode.editor.en;

public class KokoEatingBananas {
    public static void main(String[] args) {
        Solution solution = new KokoEatingBananas().new Solution();
    }

    // [875]Koko Eating Bananas
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minEatingSpeed(int[] piles, int h) {
            int left = 1;
            int right = 1000000000;

            while (left < right) {
                int mid = left + (right - left) / 2;
                if (isConsumable(piles, h, mid))
                    right = mid;
                else
                    left = mid + 1;
            }

            return left;
        }

        private boolean isConsumable(int[] piles, int h, int k) {
            int hours = 0;

            for (int pile : piles) {
                int hour = pile / k;
                hours += hour;

                if (pile % k != 0)
                    hours++;
            }

            return hours <= h;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}