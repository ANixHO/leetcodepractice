package leetcode.editor.en;

import java.util.*;

public class InsertDeleteGetrandomO1 {
    public static void main(String[] args) {
    }

    // [380]Insert Delete GetRandom O(1)
    //leetcode submit region begin(Prohibit modification and deletion)
    class RandomizedSet {

        // map stores the input value as key, the index of input values in list as value
        // list stores every input
        Map<Integer, Integer> map;
        List<Integer> list;

        public RandomizedSet() {
            map = new HashMap<>();
            list = new ArrayList<>();
        }

        public boolean insert(int val) {
            if (map.containsKey(val)) return false;

            map.put(val, list.size());
            list.add(val);
            return true;
        }

        public boolean remove(int val) {
            if (!map.containsKey(val)) return false;

            int index = map.get(val);
            list.set(index, list.get(list.size() - 1));
            map.put(list.get(index), index);
            list.remove(list.size() - 1);
            map.remove(val);
            return true;

        }

        public int getRandom() {
            Random random = new Random();
            int num = list.get(random.nextInt(list.size()));
            return num;

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