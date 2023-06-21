package udemy.homeworks.hw24and25;

public abstract class Animal {
    abstract void eat();
    abstract void sleep();
    String name;
    Animal(String name) {
        this.name = name;
    }
}
abstract class Fish extends Animal{
    Fish(String nameFish){
        super(nameFish);
        this.name = nameFish;
    }
    @Override
    void sleep() {
        System.out.println("Всегда интересно наблюдать за тем, как спят рыбы!");
    }
    abstract void swim();
}
abstract class Bird extends Animal implements Speakable {
    Bird(String nameBird){
        super(nameBird);
        this.name = nameBird;
    }
    abstract void fly();
    public void speak(){
        System.out.println(name + " поет");
    }
}
abstract class Mammal extends Animal implements Speakable {
    Mammal(String nameMammal){
        super(nameMammal);
        this.name = nameMammal;
    }
    abstract void run();
}

class Swordholder extends Fish{
    Swordholder(String nameSwordholder){
        super(nameSwordholder);
        this.name = nameSwordholder;
    }
    @Override
    void swim() {
        System.out.println("Меченосец красивая рыба, которая быстро плавает!");
    }
    @Override
    void eat() {
        System.out.println("Меченосец не хищная рыба, и она ест обычный рыбий корм!");
    }
}

class Pinguin extends Bird{
    Pinguin(String namePinguin){
        super(namePinguin);
        this.name = namePinguin;
    }
    @Override
    void eat() {
        System.out.println("Пингвин любит есть рыбу!");
    }
    @Override
    void fly() {
        System.out.println("Пингвины не умеют летать!");
    }
    @Override
    public void speak() {
        System.out.println("Пингвины не умеют петь как соловьи!");
    }
    void sleep() {
        System.out.println("Пингвины спят прижавшись друг к другу!");
    }
}

class Lion extends Mammal{
    Lion(String nameLion){
        super(nameLion);
        this.name = nameLion;
    }
    @Override
    void eat() {
        System.out.println("Лев, как любой хищник любит мясо!");
    }
    @Override
    void sleep() {
        System.out.println("Большую часть дня лев спит!");
    }
    @Override
    void run() {
        System.out.println("Лев это не самая быстрая кошка!");
    }
}
class Lesson25 {
    public static void main(String[] args) {
        Animal a1 = new Pinguin("Vasya");
        Animal a2 = new Swordholder("Petya");
        Animal a3 = new Lion("Lenya");
        Fish f1 = new Swordholder("Fish Petya");
        Bird b1 = new Pinguin("Bird Vasya");
        Mammal m1 = new Lion("Mammal Lenya");
        Pinguin p1 = new Pinguin("Pinguin Petya");
        Swordholder s1 = new Swordholder("Swordholder Petya");
        Lion l1 = new Lion("Lion Lenya");
        Animal [] arr1 = {a1,a2,a3,f1,b1,m1,p1,s1,l1};
        for (Animal test : arr1){
            if (test instanceof Pinguin){
                Pinguin pin = (Pinguin)test;
                System.out.println(pin.name);
                pin.eat();
                pin.fly();
                pin.sleep();
                pin.speak();
            }
        }
    }
}
interface Speakable{
    default void speak(){
        System.out.println("Кто-то разговаривает");
    }
}