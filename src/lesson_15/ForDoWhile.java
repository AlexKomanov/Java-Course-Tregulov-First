package lesson_15;

public class ForDoWhile {
    public static void main(String[] args) {

        for (int hour = 0; hour < 24; hour++) {
            int minute = 0;
            while (minute < 60){
                System.out.printf("%02d", hour);
                System.out.printf(" : %02d", minute);
                System.out.println();
                minute++;
            }
            System.out.println("\n----------------------\n");
        }
    }
}
