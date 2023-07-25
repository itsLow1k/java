package leetcode.problem3_todo;

import java.util.HashSet;
import java.util.Set;

// Решение из ChatGPT
public class SolutionHashSet {
    public int lengthOfLongestSubstring(String string) {
        int counter = 0;
        Set<Character> set = new HashSet<>();
        int left = 0;

        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            while (set.contains(currentChar)) {
                set.remove(string.charAt(left));
                left++;
            }
            set.add(currentChar);
            if (counter < set.size()){
                counter = set.size();
            }
            System.out.println(counter);
            System.out.println(set);
        }
        return counter;
    }

    public static void main(String[] args) {
        SolutionHashSet solution = new SolutionHashSet();
        solution.lengthOfLongestSubstring("qrsvbspk");
    }
}
