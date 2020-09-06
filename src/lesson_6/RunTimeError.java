package lesson_6;

/**
 * @author Alex Komanov
 */
public class RunTimeError {
    public static void main(String[] args) {


        /*
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	    at lesson_6.RunTimeError.main(RunTimeError.java:9)
	    */
        int a = 5 / 0;
    }
}
