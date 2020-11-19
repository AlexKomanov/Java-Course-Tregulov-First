package lesson_14;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 40; i++) {
            if (i == 22){
                break;
            }
            if (i == 10){
                continue;
            }
            if (i % 2 == 0){
                System.out.print(i + " ");
            }

        }

        OUTER: for (int i = 0; i <= 23; i++) {
            INNER: for (int j = 0; j <= 59; j++) {
                System.out.printf("%02d", i);
                System.out.printf(" : %02d", j);
                if (j == 30){
                    break INNER;
                }
                System.out.println();
            }
            if (i == 2){
                break OUTER;
            }
        }

        System.out.println("\n------------");

        //Without curly braces
        if (true)
            for (int i = 0; i < 10; i++)
                System.out.print(i + " ");



    }
}
