package leetcode.editor.en;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ValidAnagram{
    public static void main(String[] args) {
        Solution solution = new ValidAnagram().new Solution();
    }
// [242]Valid Anagram
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0) + 1);
            mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : mapS.entrySet()){
           if (!mapT.containsKey(entry.getKey())){
               return false;
           } else if (!Objects.equals(mapT.get(entry.getKey()), entry.getValue())){
               return false;
           }
        }

        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}