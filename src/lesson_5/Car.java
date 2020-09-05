package lesson_5;

/**
 * @author Alex Komanov
 */
public class Car {

    /**
     * @Constructors
     * @Default - Created by compiler - if there are no other constructors
     * @User_Defined - Created by user
     */

    String color;
    String engine;
    int speed;

    //Like a Default Constructor
    Car(){}

    //User Constructor
    Car(String userColor, String userEngine, int userSpeed){
        System.out.println("Object was created!");
        color = userColor;
        engine = userEngine;
        speed = userSpeed;
    }

    int gas(int acceleraion) {
        System.out.println("More Speed!");
        return speed += acceleraion;
    }

    int breakCar(int deaccelearation) {
        System.out.println("Less Speed...");
        return speed -= deaccelearation;
    }

    void showInfo() {
        System.out.println("color = '" + color + "', engine = '" + engine + "', speed = " + speed);
    }
}

class CarTest {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.color = "white";
        car1.engine = "V8";
        car1.speed = 100;

        Car car2 = new Car("Black", "V10", 400);

        car1.showInfo();

        car1.gas(40);
        car1.showInfo();

        car1.breakCar(10);
        car1.showInfo();

        car2.showInfo();
    }
}

