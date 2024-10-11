package leetcode.editor.en;

public class ImplementTriePrefixTree {
    public static void main(String[] args) {
        Solution solution = new ImplementTriePrefixTree().new Solution();
    }

    // [208]Implement Trie (Prefix Tree)
//leetcode submit region begin(Prohibit modification and deletion)
    class Trie {

        public class Node {

            boolean wordEnd;
            Node[] child;

            public Node() {
                this.wordEnd = false;
                this.child = new Node[26];
            }
        }

        Node start;

        public Trie() {
            start = new Node();
        }

        public void insert(String word) {
            Node cur = start;
            for (char c : word.toCharArray()) {
                int index = c - 'a';

                if (cur.child[index] == null) {
                    cur.child[index] = new Node();
                }

                cur = cur.child[index];
            }
            cur.wordEnd = true;

        }

        public boolean search(String word) {
            Node cur = start;

            for (char c : word.toCharArray()) {
                int index = c - 'a';

                if (cur.child[index] == null) return false;

                cur = cur.child[index];
            }

            return cur.wordEnd;
        }

        public boolean startsWith(String prefix) {
            Node cur = start;

            for (char c : prefix.toCharArray()) {
                if (cur.child[c - 'a'] == null) return false;
                cur = cur.child[c - 'a'];
            }

            return true;
        }
    }

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
//leetcode submit region end(Prohibit modification and deletion)

}