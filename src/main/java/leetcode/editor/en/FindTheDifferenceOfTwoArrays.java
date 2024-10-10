package leetcode.editor.en;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindTheDifferenceOfTwoArrays {
    public static void main(String[] args) {
        Solution solution = new FindTheDifferenceOfTwoArrays().new Solution();
    }

    // [2215]Find the Difference of Two Arrays
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

            HashSet<Integer> set1 = new HashSet<>();
            HashSet<Integer> set2 = new HashSet<>();

            List<List<Integer>> res = new ArrayList<>();
            List<Integer> uniq1 = new ArrayList<>();
            List<Integer> uniq2 = new ArrayList<>();


            for (int i : nums1) {
                set1.add(i);
            }

            for (int i : nums2) {
                set2.add(i);
            }


            for (int num : set1){
                if (!set2.contains(num)){
                    uniq1.add(num);
                }
            }

            for (int num : set2){
                if (!set1.contains(num)){
                    uniq2.add(num);
                }
            }

            res.add(uniq1);
            res.add(uniq2);

            return res;



        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}