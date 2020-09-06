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

    public Student(int cardId, String firstName, String lastName, int year, double averageMath, double averageEconomy, double averageLanguage) {
        this.cardId = cardId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.averageMath = averageMath;
        this.averageEconomy = averageEconomy;
        this.averageLanguage = averageLanguage;
    }

    public Student(int cardId, String firstName, String lastName, int year) {
        this.cardId = cardId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
    }

    public Student() {
    }
}

class StudentTest{
    public static void main(String[] args) {

        Student firstStudent = new Student(10, "Andrei", "Andrei", 2020);
        Student secondStudent = new Student(10, "Mike", "Mike", 2020, 81, 81,90);
        Student thirdStudent = new Student();

        firstStudent.averageMath = 57;
        firstStudent.averageLanguage = 68;
        firstStudent.averageEconomy = 100;


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
