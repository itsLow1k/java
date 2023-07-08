package leetcode.problem28;

public class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        s1.strStr("leetcode", "leeto");
    }
}
