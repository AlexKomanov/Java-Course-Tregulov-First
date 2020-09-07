package lesson_7.homeTask;

/**
 * @author Alex Komanov
 */
public class Employee {

    private double salary;
    public String surname;
    int id;

    private Employee(double salary) {
        this.salary = salary;
    }

    public Employee(double salary, String surname, int id) {
        this.salary = salary;
        this.surname = surname;
        this.id = id;
    }

    Employee(int id) {
        this.id = id;
    }
}
