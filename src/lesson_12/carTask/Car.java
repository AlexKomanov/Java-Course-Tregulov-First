package lesson_12.carTask;

public class Car {

    protected int engine;
    protected int doorCount;

    public Car(int engine, int doorCount) {
        this.engine = engine;
        this.doorCount = doorCount;
    }
}

class CarTest{
    public static void main(String[] args) {

        Car car1 = new Car(3, 4);
        Car car2 = new Car(2, 5);
        Car car3 = car1;
        Car car4 = new Car(2, 5);

        if (car1.engine > car2.engine){

            if (car1.doorCount > car2.doorCount){
                System.out.println("Car_1 engine bigger and door count bigger.");
            }
            else {
                System.out.println("Car_1 engine bigger but door count smallest.");
            }
        }
        else {
            System.out.println("Car_2 engine is bigger.");
        }

        if (car1 == car2){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        if (car1 == car3){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
