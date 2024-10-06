package leetcode.editor.en;
public class FindTheHighestAltitude{
    public static void main(String[] args) {
         Solution solution = new FindTheHighestAltitude().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int largestAltitude(int[] gain) {
        int maxH = 0;
        int cur = 0;

        for (int i = 0; i < gain.length; i++) {
            cur += gain[i];
            if (cur > maxH) maxH = cur;
        }

        return maxH;


























//        int highest = 0;
//        int[] altitudes = new int[gain.length + 1];
//
//        altitudes[0] = 0;
//
//        for (int i = 0; i < gain.length; i++) {
//            altitudes[i + 1] = altitudes[i] + gain[i];
//
//            if (altitudes[i + 1] > highest){
//                highest = altitudes[i+1];
//            }
//        }
//
//        return highest;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}