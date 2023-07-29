package leetcode.problem20_solved;

public class Solution {
    public static boolean isValid(String s) {
        StringBuilder stringOFParentheses = new StringBuilder(s);
        for (int i = 0; i < stringOFParentheses.length()-1; i++) {
            if (stringOFParentheses.charAt(i) == '[' && stringOFParentheses.charAt(i + 1) == ']' || stringOFParentheses.charAt(i) == '{' && stringOFParentheses.charAt(i + 1) == '}' || stringOFParentheses.charAt(i) == '(' && stringOFParentheses.charAt(i + 1) == ')') {
                stringOFParentheses.delete(i, i+2);
                i = -1;
            }
        }
        System.out.println(stringOFParentheses.length() == 0);
        return stringOFParentheses.length() == 0;
    }

    public static void main(String[] args) {
        isValid("()");
    }
}
