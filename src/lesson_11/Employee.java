package lesson_11;

/**
 * @author Alex Komanov
 */
public class Employee {

    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double multipleSalary(double a){
        return a *= 2;
    }

    public void doubleSalary(){
        System.out.println("Before: " + this.salary);
        this.salary *= 2;
        System.out.println("After: " + this.salary);
    }
}

class EmployeeTest{
    public static void main(String[] args) {

        Employee employee = new Employee("Alex", 456.67);
        System.out.println(employee.salary);
        System.out.println(employee.multipleSalary(employee.salary));
        employee.doubleSalary();
    }
}