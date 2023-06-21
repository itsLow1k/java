package udemy.homeworks.hw27_28;

class NotMeatException extends RuntimeException {
    NotMeatException(String str){
        super(str);
    }

}
class NotWaterException extends Exception{
    public NotWaterException(String str) {
        super(str);
    }
}
class Tiger {
    void eat(String str) throws NotMeatException{
        if (!str.equals("meat")){
            throw new NotMeatException("Tiger don't eats " + str);
        } else {
            System.out.println("Tiger eats meat");
        }
    }
    void drink(String str2) throws NotWaterException {

        if (!str2.equals("water")){
            throw new NotWaterException("Tiger don't drinks " + str2);
        } else {
            System.out.println("Tiger drinks water");
        }
    }
}
public class Lesson27{
    public static void main(String[] args) {
        Tiger t1 = new Tiger();
        try {
            t1.eat("meat");
            t1.eat("vegetables");
        } catch (NotMeatException e){
            System.out.println("Here is exceptions about: " + e.getMessage());
        }
        try {
            t1.drink("water");
            try {
                t1.drink("juice");
            } catch (NotWaterException e){
                System.out.println("Here is exceptions about: " + e.getMessage());
            }
        } catch (Exception e){
            System.out.println("Here is exceptions about: " + e.getMessage());
        } finally {
            System.out.println("This is outer finally block");
        }

    }
}