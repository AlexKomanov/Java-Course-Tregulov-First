package lesson_12;

public class Lesson12 {
    public static void main(String[] args) {

        int a = 45;
        int salary = 300;

        if (a < 30) {
            System.out.println("a < 30");
        }
        else {
            System.out.println("a > 20");
        }

        if (salary < 100){
            System.out.println("High!");
        }
        else if(salary < 200){
            System.out.println("Low!");
        }
        else if(salary < 400){
            System.out.println("Middle!");
        }
        else if(salary < 600){
            System.out.println("Excellent!");
        }


    }
}
