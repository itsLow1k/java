package leetcode.problem14;
public class SB {
    static String prefix (String[] s){
        StringBuilder result = new StringBuilder();
        StringBuilder minLength = new StringBuilder(s[0]);
        if (s.length != 1) {
            for (int i = 1; i < s.length; i++) {
                if (s[i].length() < minLength.length()) {
                    minLength = new StringBuilder(s[i]);
                }
            }
            OUTER:
            for (int j = 0; j < minLength.length(); j++) {
                for (int k = 1; k < s.length; k++) {
                    if (s[k].charAt(j) != s[0].charAt(j)) {
                        break OUTER;
                    }
                }
                result.append(s[0].charAt(j));
            }
        } else {
            result.append(s[0]);
        }
        String finalPrefix = result.toString();
        return finalPrefix;
    }
    public static void main(String[] args) {
        prefix(new String[] {"acb","acs","acb"});
    }
}
