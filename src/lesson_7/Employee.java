package lesson_7;

/**
 * @author Alex Komanov
 */
public class Employee {

    public double salary;

    public void multipleSalary(){
        // Local variables in methods -> without access modifier. They seen only in methods.
        /*public*/ double sal = salary * 2;
        System.out.println("New salary " + sal);
    }

    public Employee(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
       Employee employee_1 = new Employee(2000);
        System.out.println(employee_1.salary);
        employee_1.multipleSalary();
    }
}

class EmployeeTest{

    public static void main(String[] args) {
        Employee employee_2 = new Employee(500);
        System.out.println(employee_2.salary);

        employee_2.multipleSalary();
    }
}
