package lesson_3.homeWork;

/**
 * @author Alex Komanov
 */
public class HomeWork {
    public static void main(String[] args) {

        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result;
        result = i2 / d1 + d2 % i1 - l;
        System.out.println("result => " + result);

        int a = 5;
        int b = 8;

        System.out.println("a => " + (a-- - --a + ++a + a++ + a));
        System.out.println("b => " + (++b - b++ + ++b - --b));
    }
}
