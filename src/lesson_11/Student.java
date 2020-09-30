package lesson_11;

/**
 * @author Alex Komanov
 */
public class Student {

    /**
     * Reference as parameter in the method -> doesn't change the address of the reference variable.
     * Reference as a parameter -> does change the parameters in the address.
     */

    protected String name;
    protected int course;
    protected double grade;

    public Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void swap(Student student1, Student student2){
        //Reference as parameter in the method -> doesn't change the address of the reference variable.
        System.out.println("Original name of Student 1 inside the method: " + student1.name);
        Student student3 = student1;
        student1 = student2;
        student2 = student3;
        System.out.println("New name of Student 1 inside the method: " + student1.name);
    }

    public static void changeName(Student student1, String name){
        //Reference as a parameter -> does change the parameters in the address.
        System.out.println("Original name -> " + student1.name);
        student1.name = name;
        System.out.println("Changed name -> " + student1.name);
    }
}


class StudentTest{
    public static void main(String[] args) {

        Student stud1 = new Student("Alex", 5, 99.2);
        Student stud2 = new Student("Sasha", 3, 89.2);
        System.out.println("Original name of stud1 -> " + stud1.name);
        Student.swap(stud1, stud2);
        System.out.println("Name of stud1 after 'swap' method -> " + stud1.name);

        Student.changeName(stud1, "New");


    }
}
