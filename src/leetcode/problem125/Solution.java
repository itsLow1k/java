package leetcode.problem125;

class Solution {
    public boolean isPalindrome(String s) {
        boolean result = false;
        s = s.toLowerCase();
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > 96 && s.charAt(i) < 123 || s.charAt(i) > 47 && s.charAt(i) < 58) {
                sb1.append(s.charAt(i));
            }
        }
        if (String.valueOf(sb1).equals(String.valueOf(sb1.reverse()))) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.isPalindrome("A man, a plan, a canal: Panama");
    }
}