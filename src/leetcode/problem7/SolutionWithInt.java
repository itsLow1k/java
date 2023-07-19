package leetcode.problem7;

public class SolutionWithInt {
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
        SolutionWithInt s = new SolutionWithInt();
        s.reverse(-20);
    }
}
