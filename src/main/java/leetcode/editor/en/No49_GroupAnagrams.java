  package leetcode.editor.en;

  import java.util.*;

  public class No49_GroupAnagrams{
      public static void main(String[] args) {
           Solution solution = new No49_GroupAnagrams().new Solution();
      }
/* 
[49]Group Anagrams
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(strs[i]);

        }
        return new ArrayList<>(map.values());
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }