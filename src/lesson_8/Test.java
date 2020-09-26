package lesson_8;

/**
 * @author Alex Komanov
 */
public class Test {

    /**
     * @final - 'Read Only'. Can't be modified. Doesn't have a default value => Should be defined (directly or via Constructor).
     * @constant -> Should be with Upper Case.
     * @static_final -> Doesn't require constructor.
     *
     */
    public final int A;
    public static final int B = 15;
    public final int C = 15;

    public Test() {
        A = 10;
    }

    // public final int b; <- Compilation Error. No Default definition. It's a 'final' variable.

    public void abc(int s) {
        final byte C;
        C = 10;
        System.out.println(C + s);
    }

    public static void main(String[] args) {

        Test test = new Test();
        // test.A *= 2; <- Compilation error. variable 'A' is final.
        System.out.println(test.A);
        System.out.println(B);
        test.abc(5);


    }
}
