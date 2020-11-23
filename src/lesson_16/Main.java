package lesson_16;

public class Main {

    /**
     String saves values in the private array.
     String saves the value in the final array
     String is immutable
     String doesn't have any method that changes individual element of chars
     @string_methods:
     - length()
     - indexOf()
     - endsWith()
     - charAt()
     - startsWith()
     - substring()
     - replace()
     - concat()
     - toLowerCase()
     - toUpperCase()
     - contains()
     - isBlank()
     - isEmpty()
     - strip()
     - stripLeading()
     - stripTrailing()

     */
    public static void main(String[] args) {
        String s1 = "hi";
        String s2 = "hi";
        String s3 = new String("hi");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }
}

class TestString{
    public static void main(String[] args) {

        String s1 = "sdwfsdf2342524hfghdfg434";
        String s2 = "    sdwfsdf2     342524hfghdfg434     ";
        String substring = s1.substring(5, 20);
        String trim = s2.trim();
        System.out.println(s1);
        System.out.println("substring = " + substring);
        System.out.println(s2);
        System.out.println("s2.length() = " + s2.length());
        System.out.println(trim);
        System.out.println("trim.length() = " + trim.length());

        String replace = substring.replace('d', 'd');
        System.out.println(replace == substring);
    }
}
