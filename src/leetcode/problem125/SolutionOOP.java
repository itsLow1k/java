package leetcode.problem125;

class SolutionOOP {

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        checkForLetterOrDigit(s);
        return false;
    }
    private boolean checkForLetterOrDigit(String s){
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                sb1.append(s.charAt(i));
            }
        }
        System.out.println(String.valueOf(sb1).equals(String.valueOf(sb1.reverse())));
        return String.valueOf(sb1).equals(String.valueOf(sb1.reverse()));
    }
    public static void main(String[] args) {
        SolutionOOP s = new SolutionOOP();
        s.isPalindrome("A man, a plan, a canal: Panama");
    }
}
