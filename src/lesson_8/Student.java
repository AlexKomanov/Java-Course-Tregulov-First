package lesson_8;

/**
 * @author Alex Komanov
 */
public class Student {

    /**
     * @static -> variable, method. Belongs to the class, not to the object.
     * @Non_Static_Method -> Can contain static and non-static variables.
     * @Static_Method -> Can contain static variables. Can't contain non-static variables.
     * @Static_Method -> Can contain new instance and his non-static method.
     */

    String name;
    int course;
    static int count; // Has the default value

    public static final int countMax = 15;

    public int nonStaticCounter;

    public Student(){}

    public Student(String name, int course) {
        count++;
        this.name = name;
        this.course = course;
        System.out.println("Student " + name + ", # " + count + " created.");
    }

    public static void showCounter(){
        System.out.println("Created students: " + count);
    }

    public static void increaseCount(){
        count++;
        showCounter();
    }

    public static void createStudent(){
        Student student = new Student();
        System.out.println("Start Non-Static value: " + student.nonStaticCounter);
        student.nonStaticCounter++;
        System.out.println("Non-Static: " + student.nonStaticCounter);
    }

}

class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("Alex", 123);
        Student student2 = new Student("Alex2", 123);
        Student student3 = new Student("Alex3", 123);

        //Access to the variable/method from the class -> Object not required
        System.out.println("Count: " + Student.count);

        //Any way -> the objects have access to hhe static variable/method.
        System.out.println(student.count); // Incorrect way of access to static

        //Students counter via method
        Student.showCounter();

        Student.increaseCount();
        Student.increaseCount();
        Student.increaseCount();
        Student.increaseCount();

        Student.createStudent();
        Student.createStudent();
        Student.createStudent();

    }
}
