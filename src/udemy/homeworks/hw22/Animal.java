package udemy.homeworks.hw22;

public class Animal {
    int eyes;
    void eat(){
        System.out.println("Animals eat");
    }
    void drink(){
        System.out.println("Animals drinks");
    }
    public Animal(){
        System.out.println("I am animal");
    }
}
class Pet extends Animal{
    String name;
    int tail = 1;
    int paw = 4;
    void run(){
        System.out.println("Pets run");
    }
    void jump(){
        System.out.println("Pets jumps");
    }
    Pet(){
        eyes = 2;
        System.out.println("I am a pet");
    }
}
class Dog extends Pet{
    void play(){
        System.out.println("Dogs plays with balls");
    }
    Dog(String name){
        System.out.println("I am a dog and my name is: " + name);
    }
}
class Cat extends Pet{
    void sleeping(){
        System.out.println("Cats sleeps at day");
    }
    Cat(String name){
        System.out.println("I am a cat and my name is: " + name);
    }
}
class Test{
    public static void main(String[] args) {
        Dog d1 = new Dog("Bobik");
        System.out.println("I have " + d1.paw + "paws");
        System.out.println();
        Cat c1 = new Cat("Murzik");
        c1.sleeping();
    }
}