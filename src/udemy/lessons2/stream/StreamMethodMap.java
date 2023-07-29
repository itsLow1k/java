package udemy.lessons2.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamMethodMap {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("hello");
        list1.add("how are u");
        list1.add("nice");
        list1.add("bye");

        list1 = list1.stream().map(element -> String.valueOf(element.length())).toList();
        System.out.println(list1);

        int[] array = {3,6,2,5,9,16,21};
        array = Arrays.stream(array).map(element -> {
            if (element % 3 == 0){
                element /= 3;
            }
            return element;
        }).toArray();
        int forForEach = 5;
//        System.out.println(Arrays.toString(array));
//        Arrays.stream(array).forEach(el -> {
//            el += forForEach;
//            System.out.println(el);
//        });
        Arrays.stream(array).forEach(StreamMethodMap::innerMethod);
    }
    static void innerMethod(int a){
        a += 5;
        System.out.println("Element after sum = " + a);
    }
}

class Test{
    static void myMethod(int a){
        a += 5;
        System.out.println("Element after sum = " + a);
    }
}