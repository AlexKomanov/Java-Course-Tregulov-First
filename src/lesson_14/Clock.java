package lesson_14;

public class Clock {
    public static void main(String[] args) {
        for (int i = 0; i <= 23; i++) {
            for (int j = 0; j <= 59; j++) {
                System.out.printf("%02d", i);
                System.out.printf(" : %02d", j);
                System.out.println();
            }
        }
    }
}
