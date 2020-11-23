package lesson_16;

public class StringFunctions {
    public static void main(String[] args) {

        String s1  = "Hello World";
        String s2 = "YouuuuHuuuuu";
        String trim = s1.concat(s2).trim();

        System.out.println(s1.indexOf('W'));
        System.out.println(s1.substring(s1.indexOf('W')));
        System.out.println("trim = " + trim);

    }
}
