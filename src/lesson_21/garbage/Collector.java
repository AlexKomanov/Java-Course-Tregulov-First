package lesson_21.garbage;

class Car{}

public class Collector {
    public static void main(String[] args) {

        Car car1 = new Car(); //<- May deleted by Garbage Collector in line 13
        Car car2 = new Car(); //<- May deleted by Garbage Collector in line 14
        Car car3 = car1;
        car1 = null;
        Car car4 = car1;
        car3 = null;
        car2 = null;
        car2 = new Car(); //<- May deleted by Garbage Collector in line 17 -> End of the method main
        System.gc();
    }
}
