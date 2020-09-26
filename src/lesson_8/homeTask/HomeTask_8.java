package lesson_8.homeTask;

/**
 * @author Alex Komanov
 */
public class HomeTask_8 {

    public final static double P = 3.14;

    public static int multiply(int a, int b, int c){
        return a * b * c;
    }

    public static void devide(int a, int b){
        System.out.println(a + " : " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));
    }

    public void circleArea(double radius){
        System.out.println("\nNon Static Method:");
        System.out.println("Area: " + radius * radius * P);
    }

    public static void circlePerimeter(double radius){
        System.out.println("\nStatic Method:");
        System.out.println("Perimeter: " + radius * 2 * P);
    }

    public void showAllInfo(double radius){
        System.out.println("\nRadius: " + radius);
        circleArea(radius);
        circlePerimeter(radius);
    }

}

class HomeTask_8_Test{

    public static void main(String[] args) {

        System.out.println(HomeTask_8.multiply(1, 3, 4));
        System.out.println(HomeTask_8.multiply(1, 6, 5));

        HomeTask_8.devide(1 ,3);
        HomeTask_8.devide(7 ,3);


        HomeTask_8 classObject = new HomeTask_8();
        classObject.circleArea(5);
        HomeTask_8.circlePerimeter(6);
        classObject.showAllInfo(10);
    }
}
