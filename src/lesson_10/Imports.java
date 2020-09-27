package lesson_10;

import lesson_9.*;
import lesson_9.homeTask.Task;
import static lesson_9.Car.count;

/**
 * @author Alex Komanov
 */
public class Imports {
    static int count = 100; //This static count will be used instead of the imported static count.

    public static void main(String[] args) {
        Car car = new Car("Red", "V12");
        car.getColor();
        System.out.println(Car.count);

        Car newCar = new Car("Blue", "V16");

        System.out.println(count);

        Task task = new Task(); // Should use specific import of sub-package -> import lesson_9.homeTask.Task;

        //Single Line Comment

        /*
        *
        *
        * Multi Line Comment
        */

        /**
         * Java Doc Comment
         */
    }
}
