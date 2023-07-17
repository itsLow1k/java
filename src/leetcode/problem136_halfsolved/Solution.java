package leetcode.problem136_halfsolved;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public int singleNumber(int[] nums) {
        ArrayList<Integer> aL = new ArrayList<>();

        for (int a : nums){
            if (aL.contains(a)){
                aL.removeAll(Collections.singletonList(a)); // Метод singletonList подсмотрен
            } else{
                aL.add(a);
            }
        }
        System.out.println(aL.get(0));
        return aL.get(0);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.singleNumber(new int[]{2, 2, 1});
    }
}

