package lesson_12.homeTask;
import static lesson_12.homeTask.Student.compareByParameters;
import static lesson_12.homeTask.Student.compareAll;

public class HomeTask {
    public static void main(String[] args) {

        Student student = new Student("Alex", 90);
        Student student2 = new Student("Alex", 90);
        Student student3 = new Student("Alex", 80);
        Student student4 = new Student("Alexis", 80);

        compareAll(student, student2);
        compareAll(student, student3);
        compareByParameters(student, student2);
        compareByParameters(student, student3);
        compareByParameters(student, student4);
    }
}

class Student{
    public String name;
    public int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public static void compareAll(Student student1, Student student2){
        if (student1.name == student2.name && student1.grade == student2.grade){
            System.out.println("Both students are equal");
        }
        else {
            System.out.println("Student are not equal.");
        }
    }

    public static void compareByParameters(Student student, Student student2){
        if (student.name == student2.name){
            if (student.grade == student2.grade){
                System.out.println("Both students are equal");
            }
            else {
                System.out.println("Names equal but grades none");
            }
        }
        else {
            System.out.println("Names are different");
        }
    }
}