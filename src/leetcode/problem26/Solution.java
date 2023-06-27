package leetcode.problem26;

import java.util.ArrayList;

class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(list.get(i - 1))) {
                nums[i] = list.get(i);
                i--;
            }
        }
        return list.size();
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        s1.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
    }
}
