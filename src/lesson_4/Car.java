package lesson_4;

/**
 * @author Alex Komanov
 */
public class Car {
    String color = "red";
    String engine = "V8";
}

class carMain{

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = car1;
        Car car3;

        System.out.println(car2.color); // Reference to the same object.
        System.out.println(new Car()); // Used once an never again.
    }

}
