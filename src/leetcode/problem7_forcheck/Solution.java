package leetcode.problem7_forcheck;

public class Solution {
    public int reverse(int x) {
        StringBuilder numFromIntVar = new StringBuilder(String.valueOf(x));
        if (numFromIntVar.charAt(0) == '-'){
            numFromIntVar.deleteCharAt(0);
        }
        numFromIntVar.reverse();
        long reversedNum = Long.parseLong(String.valueOf(numFromIntVar));
        if (reversedNum >= 2147483647 || reversedNum <= -2147483648) {
            return 0;
        } else {
            if (x < 0) {
                reversedNum *= -1;
            }
            return (int) reversedNum;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.reverse(-2147483648);
    }
}
