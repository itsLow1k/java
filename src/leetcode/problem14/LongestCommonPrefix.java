package leetcode.problem14;
public class LongestCommonPrefix {
    static String prefix (String[] s){
        String result = "";
        String minLength = s[0];
        if (s.length != 1) {
            for (int i = 1; i < s.length; i++) {
                if (s[i].length() < minLength.length()) {
                    minLength = s[i];
                }
            }
            OUTER:
            for (int j = 0; j < minLength.length(); j++) {
                for (int k = 1; k < s.length; k++) {
                    if (s[k].charAt(j) != s[0].charAt(j)) {
                        break OUTER;
                    }
                }
                result += s[0].charAt(j);
            }
        } else {
            result += s[0];
        }
        return result;
    }
    public static void main(String[] args) {
        prefix(new String[] {"acb","acs","acb"});
    }
}
