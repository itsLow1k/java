package leetcode.problem3;

public class SolutionSB {
    public int lengthOfLongestSubstring(String string) {
        int maxLength = 0;
        StringBuilder startString = new StringBuilder(string);
        StringBuilder substringWithoutRepeating = new StringBuilder();
        for (int i = 0; i < startString.length(); i++) {
            if (!substringWithoutRepeating.toString().contains(String.valueOf(startString.charAt(i)))) {
                substringWithoutRepeating.append(startString.charAt(i));
            } else {
                startString.deleteCharAt(0);
                substringWithoutRepeating.setLength(0);
                i=0;
                substringWithoutRepeating.append(startString.charAt(i));
                continue;
            }
            if (maxLength < substringWithoutRepeating.length()){
                maxLength = substringWithoutRepeating.length();
            }
            System.out.println(maxLength);
            System.out.println(substringWithoutRepeating);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        SolutionSB solution = new SolutionSB();
        solution.lengthOfLongestSubstring("abcabcbb");
    }
}
