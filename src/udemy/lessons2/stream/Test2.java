package udemy.lessons2.stream;

import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        Stream<Integer> str = Stream.of(1,2,3,4,5);
        System.out.println(str.count());
    }
}
