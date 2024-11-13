package leetcode.editor.en;

import java.util.Map;

public class No383_RansomNote {
    public static void main(String[] args) {
        Solution solution = new No383_RansomNote().new Solution();
    }

    // [383]Ransom Note
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            int[] counts = new int[26];
            char[] mag = magazine.toCharArray();
            char[] ran = ransomNote.toCharArray();

            for (char c : mag){
                counts[c - 'a']++;
            }

            for (char c : ran){
                if (counts[c - 'a'] <= 0){
                    return false;
                }

                counts[c - 'a']--;
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}