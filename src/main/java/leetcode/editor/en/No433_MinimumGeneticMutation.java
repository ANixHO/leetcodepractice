  package leetcode.editor.en;

  import java.util.*;

  public class No433_MinimumGeneticMutation{
      public static void main(String[] args) {
           Solution solution = new No433_MinimumGeneticMutation().new Solution();
      }
/* 
[433]Minimum Genetic Mutation
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        Map<String,Integer> map = new HashMap<>();
        Queue<String> geneQueue= new LinkedList<>();
        Queue<Integer> res = new LinkedList<>();

        for (String gene : bank){
            map.put(gene, 0);
        }

        geneQueue.offer(startGene);
        res.offer(0);

        while (!geneQueue.isEmpty()){
            String currGene = geneQueue.poll();
            int currCount = res.poll();

            if (currGene.equals(endGene)) return currCount;

            for (String gene : bank){
                if (isMutate(currGene, gene) && map.get(gene) == 0){
                    geneQueue.offer(gene);
                    res.offer(currCount + 1);
                    map.put(gene, 1);
                }
            }
        }

        return -1;

    }

    private boolean isMutate(String gene1, String gene2){
        int count = 0;
        for (int i = 0; i < 8; i++) {
            if (gene1.charAt(i) != gene2.charAt(i)) count ++;
        }
        return count == 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }