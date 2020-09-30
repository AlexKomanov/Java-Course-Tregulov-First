package lesson_11.homeWork;

/**
 * @author Alex Komanov
 */
public class Car {

    public String color;
    public String engine;
    public int doorsNumber;

    public Car(String color, String engine, int doorsNumber) {
        this.color = color;
        this.engine = engine;
        this.doorsNumber = doorsNumber;
    }
}

class CarTest{

    public static void changeDoors(Car car, int numberOfDoors){
        System.out.println("Old number of doors -> " + car.doorsNumber);
        car.doorsNumber = numberOfDoors;
        System.out.println("New number of doors -> " + car.doorsNumber);
    }

    public static void changeColors(Car car1, Car car2){
        System.out.println("Color of car 1 -> " + car1.color);
        System.out.println("Color of car 2 -> " + car2.color);
        String color = car1.color;
        car1.color = car2.color;
        car2.color = color;
        System.out.println("New color of car 1 -> " + car1.color);
        System.out.println("New color of car 2 -> " + car2.color);

    }
    public static void main(String[] args) {

        Car car1 = new Car("black", "v16", 4);
        Car car2 = new Car("white", "v12", 6);

        changeDoors(car1, 12);
        changeColors(car1, car2);

    }
}
