package leetcode.problem4;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0;
        int index = 0;
        List<Double> list = new ArrayList<>();
        for (double i : nums1) {
            list.add(i);
        }
        for (double i : nums2) {
            list.add(i);
        }
        Collections.sort(list);
        if (list.size() % 2 == 0){
            index = list.size() / 2;
            result = (list.get(index-1) + list.get(index)) / 2;
            System.out.println(result);
            return result;
        } else{
            index = list.size() / 2;
            result = list.get(index);
            System.out.println(result);
            return result;
        }
    }

    public static void main(String[] args) {
        findMedianSortedArrays(new int[]{1, 3}, new int[]{5});
    }
}
