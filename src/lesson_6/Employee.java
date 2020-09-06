package lesson_6;

/**
 * @author Alex Komanov
 */
public class Employee {

    //Constructors with different parameters -> Constructor overloading

    public Employee(String surname, int age) {
        this.surname = surname;
        this.age = age;
    }

    public Employee(int id, String surname, int age) {
        this(surname, age);
        this.id = id;
    }

    public Employee(int id, String surname, int age, double salary, String department) {
        this(id, surname, age);
        this.salary = salary;
        this.department = department;
    }

    int id;
    String surname;
    int age;
    double salary;
    String department;
}

class EmployeeTest{

    public static void main(String[] args) {

    Employee employee = new Employee(32456, "Sidorov", 32);
    Employee employee2 = new Employee("Ivanov", 33);
    Employee employee3 = new Employee(4567, "Strelov", 45, 45678.876, "QA");

        System.out.println(employee.age);
        System.out.println(employee2.age);
        System.out.println(employee3.age);
    }



}
