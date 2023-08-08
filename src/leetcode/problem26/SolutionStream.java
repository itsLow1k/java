package leetcode.problem26;

import java.util.Arrays;

public class SolutionStream {
    public static int removeDuplicates(int[] nums) {
        int[] tempNums;
        tempNums = Arrays.stream(nums).distinct().toArray();
        System.arraycopy(tempNums, 0, nums, 0, tempNums.length);
        return (int) Arrays.stream(nums).distinct().count();
    }

    public static void main(String[] args) {
        removeDuplicates(new int[]{1, 1, 2});
    }
}
