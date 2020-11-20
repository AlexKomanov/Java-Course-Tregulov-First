package lesson_15;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your start amount: ");
        int startAmount = scanner.nextInt();

        while (startAmount > 0){
            System.out.println("Enter your game amount: ");
            int gameAmount = scanner.nextInt();
            startAmount-=gameAmount;
            System.out.println("You lose... Remaining amount.. " + startAmount);
        }

        System.out.println("Exit the casino, Bye!");
    }
}

class WhileLoopWithCondition{
    public static void main(String[] args) {

        int a = 1;

        while (true){
            System.out.println(a);
            if (a % 9 == 0 && a % 10 == 0){
                break;
            }
            a++;
        }
    }
}
