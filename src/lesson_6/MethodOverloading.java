package lesson_6;

/**
 * @author Alex Komanov
 */
public class MethodOverloading {

//    // ** Methods with different name and same functionality **
//    void showInt(int i1){
//        System.out.println(i1);
//    }
//    void showBoolean(boolean b1){
//        System.out.println(b1);
//    }

    /**
     * @Overloading - same method name with different parameters
     * @show(){} - overloaded method
     */
    void show(int i1){
        System.out.println(i1);
    }

    void show(boolean b1){
        System.out.println(b1);
    }

    void show(String s1){
        System.out.println(s1);
    }

    void show(String s, int a){
        System.out.println("String: " + s + ", int: " + a);
    }

    void show(int a, String s){
        System.out.println("Have a nice Day!");
    }

}

class MethodOverloadingTest{
    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();

        int a = 500;
        boolean b = true;
        String s = "Hello!";

        methodOverloading.show(b);
        methodOverloading.show(a);
        methodOverloading.show(s);
        methodOverloading.show("Hello", 56);
        methodOverloading.show(5, "a");
    }
}
