package leetcode.editor.en;

import com.sun.source.tree.Tree;

import java.util.*;

public class KeysAndRooms{
    public static void main(String[] args) {
         Solution solution = new KeysAndRooms().new Solution();
    }
// [841]Keys and Rooms
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    private Set<Integer> keys ;
    private List<Integer> visited ;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> keys = new TreeSet<>();
        keys.add(0);
        graphDFS(rooms,keys,rooms.get(0));
        return keys.size() == rooms.size();
    }

    private void graphDFS(List<List<Integer>> rooms, Set<Integer> keys, List<Integer> room){
        for (Integer key : room){
            if (keys.add(key)){
                graphDFS(rooms, keys, rooms.get(key));
            }
        }
    }

}
//leetcode submit region end(Prohibit modification and deletion)
    	
}