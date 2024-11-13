  package leetcode.editor.en;

  import java.util.HashMap;
  import java.util.HashSet;
  import java.util.Map;
  import java.util.Set;

  public class No290_WordPattern{
      public static void main(String[] args) {
           Solution solution = new No290_WordPattern().new Solution();
      }
/* 
[290]Word Pattern
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] patterns = pattern.toCharArray();
        String[] strs = s.split(" ");

        if (patterns.length != strs.length) return false;

        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < patterns.length; i++) {
            if (map.containsKey(patterns[i])){
                if (!map.get(patterns[i]).equals(strs[i])) return false;

            }
            map.put(patterns[i], strs[i]);
            set.add(strs[i]);
        }
        return set.size() == map.size();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }