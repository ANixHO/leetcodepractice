  package leetcode.editor.en;
  public class No151_ReverseWordsInAString{
      public static void main(String[] args) {
           Solution solution = new No151_ReverseWordsInAString().new Solution();
           solution.reverseWords("the sky is blue");
      }
/* 
[151]Reverse Words in a String
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        int left = 0;
        int right = strs.length - 1;

        while(right > left){
//            while(right > left && strs[left].isEmpty()){
//                left++;
//            }
//            while(right > left && strs[right].isEmpty()){
//                right--;
//            }

            String temp = strs[right];
            strs[right] = strs[left];
            strs[left] = temp;

            left++;
            right--;
        }

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            if (!strs[i].isEmpty()){
                res.append(strs[i]);
                res.append(' ');
            }
        }
        return res.deleteCharAt(res.length()-1).toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }