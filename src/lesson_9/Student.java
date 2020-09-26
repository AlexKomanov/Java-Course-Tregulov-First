package lesson_9;

/**
 * @author Alex Komanov
 */
public class Student {

}

class StudentTest{
    public static void main(String[] args) {

        /**
         * @Garbage_Collector -> Deletes unused objects.
         * @Garbage_Collector -> Managed By JVM.
         */
        Student student = new Student();
        Student student1 = new Student();
        Student student2; // Doesn't create object.

        student = null; // <- student Object ends his life cycle. We disconnected his reference.

    }
}
