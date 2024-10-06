package leetcode.editor.en;

import java.util.ArrayDeque;
import java.util.Queue;

public class ReverseWordsInAString{
    public static void main(String[] args) {
         Solution2 solution = new ReverseWordsInAString().new Solution2();
         String str = solution.reverseWords("the sky is blue");
        System.out.println(str);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseWords(String s) {
        String[] strs = s.split(" ");

        String ss = "";
        for (int i = strs.length -1;  i > -1; i--) {
            if(!strs[i].isEmpty()){
                ss += strs[i];
                ss += " ";
            }
        }

        char c = ss.charAt(ss.length() -1);
        if(c == ' '){
            ss = ss.substring(0, ss.length()-1);
        }


        return ss;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

    class Solution2 {
        public String reverseWords(String s) {
            char[] c = s.toCharArray();
            char[] r = new char[c.length];

            int ri = findAndCopyWord(c, r, 0, 0);

            return new String(r, 0, ri);
        }

        // Best solution
        private int findAndCopyWord(char[] c, char[] r, int i, int ri) {
            while(i<c.length && c[i]==' ')i++;
            int e = i;
            while(e<c.length && c[e]!=' ')e++;

            if(i==e) return ri;

            ri = findAndCopyWord(c,r,e+1, ri);

            if(ri>0) {
                r[ri]=' ';
                ri++;
            }
            for(int j=i;j<e;j++) {
                r[ri++]=c[j];
            }
            return ri;
        }

    }
}