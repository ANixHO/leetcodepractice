package leetcode.editor.en;

import java.util.*;

public class FindTheDifferenceOfTwoArrays {
    public static void main(String[] args) {
        Solution solution = new FindTheDifferenceOfTwoArrays().new Solution();

        solution.findDifference(new int[]{1, 2, 3, 3}, new int[]{1, 1, 2, 2});
    }



    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
            Set<Integer> set1 = new HashSet<>();
            for (int i : nums1){
                set1.add(i);
            }

            Set<Integer> set2 = new HashSet<>();
            for (int i: nums2){
                set2.add(i);
            }

            List<Integer> list1 = new ArrayList<>();
            for (int i : set1){
                if(!set2.contains(i)){
                    list1.add(i);
                }
            }

            List<Integer> list2 = new ArrayList<>();
            for (int i: set2){
                if(!set1.contains(i)){
                    list2.add(i);
                }
            }

            List<List<Integer>> result = new ArrayList<>();
            result.add(list1);
            result.add(list2);

            return result;


        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}