package leetcode.problem13;

//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000

public class Solution {
    static int trans(String  s){
        int result = 0;
        int num = 0;
        int prev = 0;
        for (int i = s.length(); i != 0; i--){
            switch (s.charAt(i - 1)) {
                case 'I' -> num = 1;
                case 'V' -> num = 5;
                case 'X' -> num = 10;
                case 'L' -> num = 50;
                case 'C' -> num = 100;
                case 'D' -> num = 500;
                case 'M' -> num = 1000;
            }
            if (num >= prev){
                result += num;
            } else {
                result -= num;
            }
            prev = num;
            System.out.println(result);
        }
        return result;
    }

    public static void main(String[] args) {
        trans("XIX");

    }
}
