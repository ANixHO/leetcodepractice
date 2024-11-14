  package leetcode.editor.en;
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
        int[] res = new int[26];

        if (cs.length != ct.length) return false;

        for (int i = 0; i < cs.length; i++) {
            res[cs[i]- 'a']++;
            res[ct[i]- 'a']--;
        }

        for(int i : res){
            if (i != 0) return false;
        }

        return true;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }