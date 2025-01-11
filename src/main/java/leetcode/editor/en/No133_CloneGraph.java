  package leetcode.editor.en;


  import java.util.ArrayList;
  import java.util.HashMap;
  import java.util.List;
  import java.util.Map;

  public class No133_CloneGraph{
      public static void main(String[] args) {
           Solution solution = new No133_CloneGraph().new Solution();
      }
/* 
[133]Clone Graph
*/
      //leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    // k: original node, v: cloned node
    Map<Node, Node> map = new HashMap<>();
    public Node cloneGraph(Node node) {
        if (node == null) return null;

        // if the target cloned node exists in the map, just return it
        if (map.containsKey(node)) return map.get(node);

        // if the target cloned node is not exist in the map
        // make a new cloned node, and put it in the map
        Node clonedNode = new Node(node.val);
        map.put(node, clonedNode);

        // clone the neighbors list
        // if cloned neighbor node is in the map, it will be returned and added to list
        for (Node neighbor : node.neighbors){
            clonedNode.neighbors.add(cloneGraph(neighbor));
        }

        return clonedNode;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }
  class Node {
      public int val;
      public List<Node> neighbors;
      public Node() {
          val = 0;
          neighbors = new ArrayList<Node>();
      }
      public Node(int _val) {
          val = _val;
          neighbors = new ArrayList<Node>();
      }
      public Node(int _val, ArrayList<Node> _neighbors) {
          val = _val;
          neighbors = _neighbors;
      }
  }