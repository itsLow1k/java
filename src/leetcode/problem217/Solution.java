package leetcode.problem217;

import java.util.Arrays;

public class Solution {
    static boolean containsDuplicate(int[] a) {
        boolean result = false;
        Arrays.sort(a);
        for (int b = 1; b < a.length; b++) {
            if (a[b] == a[b - 1]) {
                result = true;
                break;
            }
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        containsDuplicate(new int[]{3, 3});
    }
}
