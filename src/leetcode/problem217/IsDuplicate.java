package leetcode.problem217;

import java.util.Arrays;

public class IsDuplicate {
    static boolean method(int[] a){
        boolean result = false;
        Arrays.sort(a);
        for (int b = 0; b < a.length - 1; b++){
            if (a[b] == a[b + 1] && b != a.length-1) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        method(new int[]{1,1,1,3,3,4,3,2,4,2});
    }
}
