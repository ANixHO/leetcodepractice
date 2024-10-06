package leetcode.editor.en;
public class StringCompression{
    public static void main(String[] args) {
         Solution solution = new StringCompression().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int compress(char[] chars) {
        int count = 1;
        int n = chars.length;
        StringBuilder sb = new StringBuilder();

        sb.append(chars[0]);

        for (int i = 1; i < n; i++) {

            if (chars[i] == chars[i -1]){
                count ++;
            }else {
                if(count != 1){
                    sb.append(count);
                }

                count = 1;
                sb.append(chars[i]);
            }
        }

        if (count != 1){
            sb.append(count);
        }
        
        for (int i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }

        return sb.length();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}