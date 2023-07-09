package leetcode.problem7;

public class Solution {
    public int reverse(int x) {
        StringBuilder numFromIntVar = new StringBuilder(String.valueOf(x));
        if (numFromIntVar.charAt(0) == '-'){
            numFromIntVar.deleteCharAt(0);
        }
        numFromIntVar.reverse();
        long lll = Long.parseLong(String.valueOf(numFromIntVar));
        if (lll >= 2147483647 || lll <= -2147483648) {
            return 0;
        } else {
            if (x < 0) {
                lll *= -1;
            }
            return (int) lll;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.reverse(-2147483648);
    }
}
