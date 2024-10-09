package leetcode.editor.en;

import java.util.*;

public class EvaluateDivision {
    public static void main(String[] args) {
        Solution solution = new EvaluateDivision().new Solution();
    }

    // [399]Evaluate Division
//leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
            double[] res = new double[queries.size()];

            // put every element into the graph(map)
            // with its edge value to linked elements as the map value
            Map<String, Map<String, Double>> graph = new HashMap<>();
            for (int i = 0; i < equations.size(); i++){
                String e1 = equations.get(i).get(0);
                String e2 = equations.get(i).get(1);
                graph.putIfAbsent(e1, new HashMap<>());
                graph.putIfAbsent(e2, new HashMap<>());

                // in each equations[i], edge of e1 -> e2 equals values[i]
                // on the contrary, edge of e2 -> e1 equals 1 / values[i]
                // so we can get double direction edges of two linked elements
                graph.get(e1).put(e2,values[i]);
                graph.get(e2).put(e1, 1.0 / values[i]);
            }

            for (int i = 0; i < queries.size(); i++) {
                String begin = queries.get(i).get(0);
                String end = queries.get(i).get(1);
                if (!graph.containsKey(begin) ||
                    !graph.containsKey(end)){

                    res[i] = -1.0;

                } else {

                    // dfs the graph, store the visited node in the hash set
                    res[i] = dfs(graph, begin, end, new HashSet<>());
                }
            }

            return res;
        }

        private double dfs(Map<String, Map<String, Double>> graph,
                           String begin,
                           String end,
                           Set<String> visited){

            // in this dfs method, it will iterate every element recursively
            // when it found the target element, which is "end" variable
            // it will return 1.0, and start to return up the multiplied value of edge
            // from end element to begin element.
            // but, when it arrives to an element which is not the target end element
            // it cannot enter the for loop below, because its keyset() returns null
            // and it will return up -1.0 to the previous level
            // so when it goes to "if (res>0){}" it will be ignored and will not do the multiple calculate
            if (begin.equals(end)) return 1.0;

            visited.add(begin);

            for (String next : graph.get(begin).keySet()){
                if (visited.contains(next)) continue;

                double res = dfs(graph, next, end, visited);
                if (res > 0){
                    return graph.get(begin).get(next) * res;
                }
            }

            return -1.0;

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}