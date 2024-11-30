  package leetcode.editor.en;
  public class No88_MergeSortedArray{
      public static void main(String[] args) {
           Solution solution = new No88_MergeSortedArray().new Solution();
           solution.merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
      }
      // [88]Merge Sorted Array
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m];
        for (int i = 0; i < m; i++) temp[i] = nums1[i];

        int i1 = 0;
        int i2 = 0;
        int index = 0;

        while(i1 < m && i2 < n){
            if (temp[i1] <= nums2[i2]) nums1[index] = temp[i1++];
            else nums1[index] = nums2[i2++];

            index ++;
        }

        while(i1 < m) nums1[index++] = temp[i1++];
        while(i2 < n) nums1[index++] = nums2[i2++];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }