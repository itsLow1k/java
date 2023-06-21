package leetcode.problem9;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        StringBuilder temp = new StringBuilder(str);
        return (temp.reverse().toString().equals(str));
    }

    public static void main(String[] args) {
        isPalindrome(121);
    }
}
