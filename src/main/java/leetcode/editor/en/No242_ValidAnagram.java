  package leetcode.editor.en;

  import java.util.Arrays;
  import java.util.Collections;

  public class No242_ValidAnagram{
      public static void main(String[] args) {
           Solution solution = new No242_ValidAnagram().new Solution();
      }
/* 
[242]Valid Anagram
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        int[] arr = new int[26];
        Arrays.fill(arr, 0);
        if (cs.length != ct.length) return false;

        for (int i = 0; i < cs.length; i++) {
            arr[cs[i] - 'a'] ++;
            arr[ct[i] - 'a'] --;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) return false;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }