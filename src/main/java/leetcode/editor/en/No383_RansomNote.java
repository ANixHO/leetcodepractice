  package leetcode.editor.en;
  public class No383_RansomNote{
      public static void main(String[] args) {
           Solution solution = new No383_RansomNote().new Solution();
      }
/* 
[383]Ransom Note
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) return false;
        char[] charMag = magazine.toCharArray();
        char[] charRan = ransomNote.toCharArray();

        int[] arr = new int[26];

        for (int i = 0; i < charMag.length; i++) {
            char c = charMag[i];
            arr[c-'a'] ++;
        }

        for (int i = 0; i < charRan.length; i++) {
            char c = charRan[i];
            int rest = --arr[c-'a'];
            if (rest < 0) return false;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }