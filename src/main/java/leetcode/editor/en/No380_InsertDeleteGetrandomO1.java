package leetcode.editor.en;

import java.util.*;

public class No380_InsertDeleteGetrandomO1 {
    public static void main(String[] args) {
    }

    /*
    [380]Insert Delete GetRandom O(1)
    */
    //leetcode submit region begin(Prohibit modification and deletion)
    class RandomizedSet {
        ArrayList<Integer> list;
        Map<Integer, Integer> map;

        public RandomizedSet() {
            list = new ArrayList<>();
            map = new HashMap<>();
        }

        public boolean insert(int val) {
            if (map.containsKey(val)) return false;
            list.add(val);
            map.put(val, list.size() - 1);
            return true;
        }

        public boolean remove(int val) {
            if (!map.containsKey(val)) return false;
            int index = map.get(val);
            list.set(index,list.get(list.size()-1));
            map.put(list.get(index), index);
            list.remove(list.size()-1);
            map.remove(val);
            return true;
        }

        public int getRandom() {
            Random random = new Random();
            int num = random.nextInt(list.size());
            return list.get(num);
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