package leetcode.editor.en;

import java.util.Arrays;


public class SuccessfulPairsOfSpellsAndPotions {
    public static void main(String[] args) {
        Solution solution = new SuccessfulPairsOfSpellsAndPotions().new Solution();
    }

    // [2300]Successful Pairs of Spells and Potions
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] successfulPairs(int[] spells, int[] potions, long success) {
            int n = spells.length, m = potions.length;
            Arrays.sort(potions);
            for(int i = 0; i < n; i++){
                spells[i] = bs(potions, spells[i], success, 0, m - 1);
            }
            return spells;
        }
        int bs(int[] nums, long t, long succ, int start, int end){
            while(start <= end){
                int mid = (start + end) >> 1;
                if((long)(t * nums[mid]) >= succ){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            return nums.length - start;

        }















//            Arrays.sort(potions);
//
//            for (int i = 0; i < spells.length; i++) {
//                //for each spell finding the number and storing without using any extra space
//                spells[i] = binarySearch(spells[i], potions, success);
//
//            }
//            return spells;
//
//        }
//
//        private int binarySearch(int num, int[] potions, long success) {
//
//            int left = 0;
//            int n = potions.length;
//            int right = n - 1;
//            // BINARY SEARCH O(Longm)
//            while (left < right) {
//                int mid = (left + right) / 2;
//                if ((long) num * potions[mid] < success) {
//                    left = mid + 1;
//                } else {
//                    right = mid;
//                }
//            }
//            //if last element check if its included cause aur algo can come and stop here even if its not included
//            if (left == n - 1) {
//                if ((long) num * potions[left] < success) {
//                    return 0;
//                }
//            }
//            // return the number of elements to the right of pointer
//            return n - left;
//
//        }


//            Arrays.sort(potions);
//            int[] res = new int[spells.length];
//
//            for (int i = 0; i < spells.length; i++) {
//
//                int left = 0;
//                int right = potions.length - 1;
//
//                while (left < right) {
//                    int mid = (right + left) / 2;
//                    if ((long) spells[i] * potions[mid] < success) {
//                        left = mid + 1;
//                    } else {
//                        right = mid;
//                    }
//                }
//
//                if (left == potions.length - 1) {
//                    if ((long) spells[i] * potions[left] < success) {
//                        res[i] = 0;
//                    }
//                }
//
//                res[i] = potions.length - left;
//
//            }
//
//
//            return res;
    }
//leetcode submit region end(Prohibit modification and deletion)
}