  package leetcode.editor.en;
  public class No211_DesignAddAndSearchWordsDataStructure{
      public static void main(String[] args) {
           Solution solution = new No211_DesignAddAndSearchWordsDataStructure().new Solution();
      }
/* 
[211]Design Add and Search Words Data Structure
*/
      //leetcode submit region begin(Prohibit modification and deletion)
class WordDictionary {
    TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }
    
    public void addWord(String word) {
        TrieNode curr = root;
        for (char c : word.toCharArray()){
            if (curr.child[c-'a'] == null){
                curr.child[c-'a'] = new TrieNode();
            }
            curr = curr.child[c-'a'];
        }
        curr.isCompleted = true;
    }

    private boolean searchHelper(String word, int index, TrieNode node){
        if (index == word.length()) return node.isCompleted;

        char c = word.charAt(index);

        if (c == '.'){
            for (int i = 0; i < 26; i++) {
                if (node.child[i] != null && searchHelper(word, index + 1, node.child[i])){
                    return true;
                }
            }
            return false;

        } else {
            if (node.child[c-'a'] == null) return false;
            return searchHelper(word, index + 1, node.child[c-'a']);
        }

    }
    
    public boolean search(String word) {
        return searchHelper(word, 0, root);
    }
}

class TrieNode{
    boolean isCompleted;
    TrieNode[] child;

    public TrieNode(){
        child = new TrieNode[26];
        isCompleted=false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
//leetcode submit region end(Prohibit modification and deletion)

  }