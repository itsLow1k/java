package leetcode.problem58;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int counter = 0;
        for (int i = s.length(); i != 0; i--){
            if (s.charAt(i-1) != ' '){
                counter += 1;
            } else if (s.charAt(i-1) == ' ' && counter >= 1){
                break;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        lengthOfLastWord("   fly me   to   the moon  ");
    }
}
