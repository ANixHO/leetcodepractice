package leetcode.editor.en;

import java.util.*;

public class No380_InsertDeleteGetrandomO1 {
    public static void main(String[] args) {
    }

    // [380]Insert Delete GetRandom O(1)
    //leetcode submit region begin(Prohibit modification and deletion)
    class RandomizedSet {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        public RandomizedSet() {

        }

        public boolean insert(int val) {
            if (!map.containsKey(val)) {
                list.add(val);
                map.put(val, list.size() - 1);
                return true;
            } else {
                return false;
            }
        }

        public boolean remove(int val) {
            if (map.containsKey(val)) {
                int index = map.get(val);
                int lastInt = list.get(list.size() - 1);
                list.set(index, lastInt);
                map.put(lastInt, index);
                list.remove(list.size() - 1);
                map.remove(val);

                return true;
            } else {
                return false;
            }
        }

        public int getRandom() {

            int temp = random.nextInt(list.size());
            return list.get(temp);

        }
    }

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
//leetcode submit region end(Prohibit modification and deletion)

}