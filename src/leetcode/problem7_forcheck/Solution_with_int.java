package leetcode.problem7_forcheck;

public class Solution_with_int {
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
        Solution_with_int s = new Solution_with_int();
        s.reverse(-20);
    }
}
