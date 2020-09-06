package lesson_6;

/**
 * @author Alex Komanov
 */
public class Constructors {

    void summary(){
        System.out.println(0);
    }

    void summary(int a1){
        System.out.println(a1);
    }

    void summary(int a1, int a2){
        System.out.println(a1+ a2);
    }

    void summary(int a1, int a2, int a3){
        System.out.println(a1+ a2 + a3);
    }

    void summary(int a1, int a2, int a3, int a4){
        System.out.println(a1+ a2 + a3 + a4);
    }

}

class ConstructorsTest{
    public static void main(String[] args) {
        Constructors constructors = new Constructors();
        constructors.summary();
        constructors.summary(1);
        constructors.summary(1, 2);
        constructors.summary(1, 2, 4);
        constructors.summary(1, 2, 3, 4);
    }
}
