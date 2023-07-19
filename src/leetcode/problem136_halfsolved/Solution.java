package leetcode.problem136_halfsolved;

import java.util.ArrayList;

public class Solution {

    public int singleNumber(int[] nums) {
        ArrayList<Integer> aL = new ArrayList<>();

        for (int a : nums) {
            if (aL.contains(a)) {
                aL.remove(Integer.valueOf(a));
            } else {
                aL.add(a);
            }
        }
        return aL.get(0);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.singleNumber(new int[]{2, 2, 1});
    }
}

