package leetcode.problem27;

import java.util.ArrayList;

class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int num : nums) {
            if (num != val){
                list.add(num);
            }

        }
        for (int i = 0; i < list.size(); i++){
            nums[i] = list.get(i);
        }
        return list.size();
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        s1.removeElement(new int[]{4,5}, 4);
    }
}
