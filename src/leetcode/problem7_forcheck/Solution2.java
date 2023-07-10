package leetcode.problem7_forcheck;

public class Solution2 {
    public int reverse(int x) {
        int reversedNum;
        StringBuilder numFromIntVar = new StringBuilder(String.valueOf(x));
        if (numFromIntVar.charAt(0) == '-') {
            numFromIntVar.deleteCharAt(0);
        }
        numFromIntVar.reverse();
        try {
            reversedNum = Integer.parseInt(String.valueOf(numFromIntVar));
        } catch (NumberFormatException exception){
            return 0;
        }
        if (x < 0) {
            reversedNum *= -1;
        }
        return reversedNum;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        s.reverse(-20);
    }
}
