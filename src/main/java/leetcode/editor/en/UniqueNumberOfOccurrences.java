package leetcode.editor.en;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences{
    public static void main(String[] args) {
         Solution solution = new UniqueNumberOfOccurrences().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> record = new HashMap<>();
        for (int i : arr){
            if (record.containsKey(i)){
                record.put(i, record.get(i) + 1);
            } else {
                record.put(i, 1);
            }
        }

        Set<Integer> occur = new HashSet<>();
        for (int i : record.values()){
            if(occur.contains(i)){
                return false;
            }else {
                occur.add(i);
            }
        }

        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}