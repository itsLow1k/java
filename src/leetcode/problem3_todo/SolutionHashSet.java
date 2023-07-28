package leetcode.problem3_todo;

import java.util.HashSet;
import java.util.Set;

public class SolutionHashSet {
    public int lengthOfLongestSubstring(String string) {
        int startPoint = 0;
        int counter = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            if (!set.contains(string.charAt(i))) {
                set.add(string.charAt(i));
                counter = Math.max(counter, set.size());
            } else {
                set.clear();
                i = startPoint++;
                set.add(string.charAt(i));
            }
//            System.out.println(counter);
//            System.out.println(set);
        }
        return counter;
    }

    public static void main(String[] args) {
        SolutionHashSet solution = new SolutionHashSet();
        solution.lengthOfLongestSubstring("abcabcabcc");
    }
}
