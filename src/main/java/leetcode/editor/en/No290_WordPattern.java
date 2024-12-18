  package leetcode.editor.en;

  import java.util.HashMap;
  import java.util.Map;

  public class No290_WordPattern{
      public static void main(String[] args) {
           Solution solution = new No290_WordPattern().new Solution();
           solution.wordPattern("abba", "dog cat cat dog");
      }
/* 
[290]Word Pattern
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strs = s.split(" ");
        if (pattern.length() != strs.length) return false;

        char[] patt = pattern.toCharArray();
        Map<Character, String> map = new HashMap<>();

        for (int i = 0; i < patt.length; i++) {
            if (map.containsKey(patt[i]) ){
                if (!map.get(patt[i]).equals(strs[i])) return false;
            } else {
                if (map.containsValue(strs[i])) return false;
                map.put(patt[i], strs[i]);
            }
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }