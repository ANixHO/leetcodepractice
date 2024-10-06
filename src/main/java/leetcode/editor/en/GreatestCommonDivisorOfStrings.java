package leetcode.editor.en;
public class GreatestCommonDivisorOfStrings{
    public static void main(String[] args) {
         Solution solution = new GreatestCommonDivisorOfStrings().new Solution();
    }
// [1071]Greatest Common Divisor of Strings
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1)) return "";
        int l = gcd(str1.length(), str2.length());
        return str1.substring(0,l);
    }

    private int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
    	
}