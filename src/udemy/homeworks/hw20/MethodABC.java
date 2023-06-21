package udemy.homeworks.hw20;

import java.util.ArrayList;
import java.util.Collections;

public class MethodABC {
    public static void abc(String ... str){
        ArrayList<String> list1 = new ArrayList<>();
        for (String s : str){
            if (list1.contains(s)){

            } else{
                list1.add(s);
            }
        }
        Collections.sort(list1);
        System.out.println(list1);

    }

    public static void main(String[] args) {
        abc("hello", "privet", "hello", "ola", "bonjour");
    }
}

