package leetcode.editor.en;

import java.util.HashMap;
import java.util.Map;

public class RansomNote{
    public static void main(String[] args) {
        Solution solution = new RansomNote().new Solution();
    }
// [383]Ransom Note
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] chars1 = ransomNote.toCharArray();
        char[] chars2 = magazine.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for (char c : chars2){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : chars1){
            if (map.containsKey(c) && map.get(c) >0){
                map.put(c, map.get(c) - 1);
            } else {
                return false;
            }
        }

        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}