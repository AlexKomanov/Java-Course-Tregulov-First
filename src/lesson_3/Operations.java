package lesson_3;

/**
 * @author Alex Komanov
 */
public class Operations {
    public static void main(String[] args) {
        int x = 3, y = 5, z = 10;
        int a = 2;
        int b = a;
        double d = 10;


        System.out.println(b);

        /*
        * -> + , - , * , / , % , ++ , --
        */

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("z / x = " + (z / x));
        System.out.println("d / x = " + (d / x));
        System.out.println("z % x = " + (z % x));

        System.out.println("z = " + z + ", y = " + y);
        System.out.println("z - y++ = " + (z - y++));
        System.out.println("z = " + z + ", y = " + y);
        System.out.println("z - ++y = " + (z - ++y));

        System.out.println("z = " + z + ", y = " + y);
        System.out.println("--z - y = " + (--z - y));
        System.out.println("z = " + z + ", y = " + y);
        System.out.println("z - y-- = " + (z - y--));
        System.out.println("z = " + z + ", y = " + y);

        int ab = 5;
        System.out.println(++ab - --ab - ab-- + ab++);

        /**
        *@operations: > , >= , < , <= , == , !=
        *@operations: || -> OR, && -> AND , ! -> NOT, ^ => EXCLUSIVE ERROR
        *@args = 0 -> false, 1 = true
        */





    }
}
