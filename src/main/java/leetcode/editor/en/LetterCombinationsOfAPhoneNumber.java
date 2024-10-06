package leetcode.editor.en;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        Solution solution = new LetterCombinationsOfAPhoneNumber().new Solution();
    }

    // [17]Letter Combinations of a Phone Number
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        private List<String> ans;
        private HashMap<Character, String> mapping;
        private String digits;

        public List<String> letterCombinations(String digits) {
            ans = new ArrayList<>();
            if (digits == null || digits.isEmpty()) return ans;
            this.digits = digits;
            mapping = new HashMap<>();

            mapping.put('2', "abc");
            mapping.put('3', "def");
            mapping.put('4', "ghi");
            mapping.put('5', "jkl");
            mapping.put('6', "mno");
            mapping.put('7', "pqrs");
            mapping.put('8', "tuv");
            mapping.put('9', "wxyz");



            StringBuilder cur = new StringBuilder();
            formatting(cur, 0);
            return ans;
        }

        private void formatting( StringBuilder cur, int index) {
            if (index == digits.length()) {
                ans.add(cur.toString());
                return;
            }


            for (char c : mapping.get(digits.charAt(index)).toCharArray()) {
                formatting(cur.append(c), index + 1);
                cur.deleteCharAt(cur.length() - 1);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}