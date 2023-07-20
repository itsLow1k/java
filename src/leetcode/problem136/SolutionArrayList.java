package leetcode.problem136;

import java.util.ArrayList;

public class SolutionArrayList {

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
        SolutionArrayList s = new SolutionArrayList();
        s.singleNumber(new int[]{2, 2, 1});
    }
}

