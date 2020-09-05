package lesson_5.homeTask;

/**
 * @author Alex Komanov
 */
public class Employee {

    int id;
    String surname;
    int age;
    double salary;
    String department;

    public Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public double increaseSalary(){
        return salary*=2;
    }
}

class EmployeeTest{


    public static void main(String[] args) {

        Employee alex = new Employee(323, "Komanov", 32, 14500, "Karmiel");
        Employee david = new Employee(324, "David", 35, 24500, "Tzafon");

        System.out.println(alex.increaseSalary());
        System.out.println(david.increaseSalary());

    }
}
