package lesson_4.homeTask;

/**
 * @author Alex Komanov
 */
public class Student {

    int cardId;
    String firstName;
    String lastName;
    int year;
    double averageMath;
    double averageEconomy;
    double averageLanguage;

}

class StudentTest{
    public static void main(String[] args) {

        Student firstStudent = new Student();
        Student secondStudent = new Student();
        Student thirdStudent = new Student();

        firstStudent.firstName = "Andrei";
        firstStudent.averageMath = 57;
        firstStudent.averageLanguage = 68;
        firstStudent.averageEconomy = 100;

        secondStudent.firstName = "Mike";
        secondStudent.averageMath = 81;
        secondStudent.averageLanguage = 81;
        secondStudent.averageEconomy = 90;


        thirdStudent.firstName = "Bruce";
        thirdStudent.averageMath = 95;
        thirdStudent.averageLanguage = 100;
        thirdStudent.averageEconomy = 90;

        averageGrade(firstStudent);
        averageGrade(secondStudent);
        averageGrade(thirdStudent);
    }

    public static void averageGrade(Student student){
        double totalGrade = student.averageEconomy + student.averageLanguage + student.averageMath;
        System.out.println(student.firstName + "'s average grade: " + totalGrade / 3);
    }
}
