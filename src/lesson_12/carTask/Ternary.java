package lesson_12.carTask;

public class Ternary {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        String answer = (a > b) ? ("A is less") : ("A is greater");
        System.out.println(answer);

        int maximum = (a > b) ? a : b;
        System.out.println("The maximum is = " + maximum);
    }
}
