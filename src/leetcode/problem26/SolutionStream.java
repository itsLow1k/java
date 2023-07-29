package leetcode.problem26;

import java.util.Arrays;

public class SolutionStream {
    public static int removeDuplicates(int[] nums) {
        int[] tempNums;
        tempNums = Arrays.stream(nums).distinct().toArray();
        for (int i = 0; i < tempNums.length; i++){
            nums[i] = tempNums[i];
        }
        return tempNums.length;
    }

    public static void main(String[] args) {
        removeDuplicates(new int[]{1, 1, 2});
    }
}
