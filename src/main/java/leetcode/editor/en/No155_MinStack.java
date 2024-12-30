  package leetcode.editor.en;

  import java.util.ArrayList;
  import java.util.List;

  public class No155_MinStack{
      public static void main(String[] args) {
      }
/* 
[155]Min Stack
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class MinStack {
    private List<Integer> minList;
    private List<Integer> list;

    public MinStack() {
        minList = new ArrayList<>();
        list = new ArrayList<>();
    }
    
    public void push(int val) {
        if (!minList.isEmpty()) {
            minList.add(Math.min(minList.get(minList.size() - 1), val));
        } else {
            minList.add(val);
        }
        list.add(val);
    }
    
    public void pop() {
        minList.remove(minList.size()-1);
        list.remove(list.size()-1);
    }
    
    public int top() {
        return list.get(list.size()-1);
    }
    
    public int getMin() {
        return minList.get(minList.size()-1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
//leetcode submit region end(Prohibit modification and deletion)

  }