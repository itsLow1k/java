package udemy.homeworks.hw22;

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;
    public StringBuilder getName (){
        StringBuilder sb = new StringBuilder(name);
        return sb;
    }
    public void setName (String s){
        if (s.length() > 2){
            StringBuilder sb = new StringBuilder(s);
            name = sb;
        }
    }
    public int getCourse (){
        return course;
    }
    public void setCourse (int a){
        if (a > 0 && a < 5){
            course = a;
        }
    }
    public int getGrade(){
        return grade;
    }
    public void setGrade(int a){
        if (a > 0 && a < 11){
            grade = a;
        }
    }
    public void showInfo(){
        System.out.println("Имя: " + getName());
        System.out.println("На курсе: " + getCourse());
        System.out.println("Учится на оценку: " + getGrade());
    }
}
class StudentTest{
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setCourse(3);
        st1.setGrade(8);
        st1.setName("Vanya");
        st1.showInfo();
    }
}