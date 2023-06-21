package leetcode.problem1;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = {0,0};
        int i = 0; // Первый индекс
        int c = 0; // Второй индекс
        for (i = 0; i < nums.length; i++) {
            for (c = 1; c < nums.length; c++) {
                if (i == c){
                    break;
                }
                if ((nums[i] + nums[c]) == target) {
                    result[0] = i;
                    result[1] = c;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] mass = {2,7,11,15};
        int tar = 26;
        twoSum(mass, tar);
    }
}