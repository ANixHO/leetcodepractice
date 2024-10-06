package leetcode.editor.en;
public class IsSubsequence{
    public static void main(String[] args) {
         Solution solution = new IsSubsequence().new Solution();
    }
// [392]Is Subsequence
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isSubsequence(String s, String t) {

        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();

        int slen = schar.length;
        int tlen = tchar.length;

        if (slen !=0 && tlen == 0) return false;
        if (slen ==0 ) return true;

        int sidx = 0;
        int tidx = 0;

        while (sidx < slen && tidx < tlen){
            if (tchar[tidx] == schar[sidx]){
                sidx ++;
            }

            tidx ++;
        }

        if (sidx == slen){
            return true;
        } else {
            return false;
        }

//        for (; tidx < tchar.length ; tidx++) {
//            if(tchar[tidx] == schar[sidx]){
//                sidx ++;
//            }
//
//            if (sidx == s.length()){
//                return true;
//            }
//        }
//
//        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}