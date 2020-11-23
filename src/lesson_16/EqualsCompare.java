package lesson_16;

public class EqualsCompare {
    public static void main(String[] args) {

        /**
         * @options:
         * ==
         * !=
         * equals()
         * equalsIgnoreCase()
         */

        //String s1 = new String("Hello");
        String s2 = new String("Hello");

        String s3 = "Hello";
        String s4 = "Hello";

        System.out.println(s3 == s4);
        System.out.println(s2 == s3);
        System.out.println("s3.equals(s2) = " + s3.equals(s2));
    }



}
