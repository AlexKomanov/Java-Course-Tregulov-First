package lesson_15;

public class DoWhile {
    public static void main(String[] args) {

        int a = 0;

        do {
            System.out.println(a);
            a++;
        }
        while (a <= 5);

        do {
            System.out.println("---------");
            System.out.println(a);
        }
        while (a <= 5);
    }
}

class ClockDoWhile{
    public static void main(String[] args) {

        int hour = 0;

        do {

            int minute = 0;
            while (minute < 60){
                System.out.printf("%02d", hour);
                System.out.printf(" : %02d", minute);
                System.out.println();
                minute++;
            }
            hour++;
        }
        while (hour < 24);

    }
}
