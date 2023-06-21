package udemy.homeworks.hw19;

public class homework20 {
    static void abc(String ... str){
        for (String a : str){
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        abc("Hi", "Bye", "No");
    }
}
