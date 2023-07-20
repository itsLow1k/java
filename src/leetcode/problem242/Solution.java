package leetcode.problem242;

import java.util.Arrays;
public class Solution {
    public boolean isAnagram(String s, String t) {
        boolean result = false;
        if (s.length() == t.length()){
            char[] arr1 = new char[s.length()];
            char[] arr2 = new char[t.length()];
            for (int i = 0; i < s.length(); i++){
                arr1[i] += s.charAt(i);
                arr2[i] += t.charAt(i);
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if (Arrays.equals(arr1, arr2)){
                result = true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution t = new Solution();
        t.isAnagram("st", "st");
    }
}
