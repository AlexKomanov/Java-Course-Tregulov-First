package lesson_8;

/**
 * @author Alex Komanov
 */
public class Human {
    String name = "Alex";
    final Car car = new Car();

    public static void main(String[] args) {
        Human human = new Human();
        //human.car = new Car(); <- Impossible to change address in the final variable.
        human.car.color = "Red"; // Field can be modified in the final variable
    }
}

class Car{

    String color = "black";
    String engine = "V8";
}

