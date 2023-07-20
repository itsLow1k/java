package leetcode.problem7;

public class Solution {
    public int reverse(int inputNum) {
        int reversedInputNum;
        StringBuilder sbInputNum = new StringBuilder(String.valueOf(inputNum));
        if (sbInputNum.charAt(0) == '-') {
            sbInputNum.deleteCharAt(0);
        }
        sbInputNum.reverse();
        try {
            reversedInputNum = Integer.parseInt(String.valueOf(sbInputNum));
        } catch (NumberFormatException exception){
            return 0;
        }
        if (inputNum < 0) {
            reversedInputNum *= -1;
        }
        return reversedInputNum;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.reverse(-20);
    }
}
