package lesson_21.constructors;

class A{
    A(){
        System.out.println("This is constructor");
    }

    static void A(){
        System.out.println("This is method");
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A();
        A.A();
    }

}
