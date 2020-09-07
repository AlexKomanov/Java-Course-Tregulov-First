package lesson_7;

/**
 * @author Alex Komanov
 */
public class DifferentClass {
    public static void main(String[] args) {
        Employee employee_2 = new Employee(500);
        System.out.println(employee_2.salary);

        employee_2.multipleSalary();
    }
}
