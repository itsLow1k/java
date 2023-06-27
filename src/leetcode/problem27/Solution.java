package leetcode.problem27;

import java.util.ArrayList;

class Solution {
    public int removeElement(int[] nums, int val) {
        int counter = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int num : nums) {
            if (num != val){
                list.add(num);
                counter += 1;
            }

        }
        for (int i = 0; i < nums.length; i++){
            if (i < list.size()){
                nums[i] = list.get(i);
            } else {
                nums[i] = 0;
            }
            System.out.println(nums[i]);
        }
        return counter;
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        s1.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2);
    }
}
