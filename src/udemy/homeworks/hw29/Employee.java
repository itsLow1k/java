package udemy.homeworks.hw29;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
    String name;
    String department;
    int salary;
    Employee(String name, String department, int salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

}
class TestEmployee{
    static void printEmployee(Employee e){
        System.out.println("    Name: " + e.name + ", department: " + e.department + ", salary: " + e.salary);
    }
    static void employeeFilter(ArrayList<Employee> aL, Predicate<Employee> t){
        for (Employee a : aL){
            if (t.test(a)){
                printEmployee(a);
            }
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Alex", "IT", 4000);
        Employee emp2 = new Employee("Ivan", "Ivan", 10000);
        Employee emp3 = new Employee("Anton", "IT", 4000);
        Employee emp4 = new Employee("Maria", "Management", 3000);
        Employee emp5 = new Employee("Elena", "Socials", 2000);
        ArrayList<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        System.out.println();
        System.out.println("|------------------------------------------------------|");
        employeeFilter(list, a -> a.salary >= 4000);
        System.out.println("|------------------------------------------------------|");
        employeeFilter(list, a -> a.name.startsWith("A"));
        System.out.println("|------------------------------------------------------|");
        employeeFilter(list, a -> a.salary<2500 && a.name.startsWith("E") );
        System.out.println("|------------------------------------------------------|");
        employeeFilter(list, a -> a.name.equals(a.department));
        System.out.println("|------------------------------------------------------|");
    }
}