package lesson_5;

/**
 * @author Alex Komanov
 */
public class HumanTest {
    public static void main(String[] args) {

        Human human = new Human();
        human.name = "Alex";
        human.car = new HumanCar("Black", "V8");
        human.bankAccount = new HumanBankAccount(123, 5678345435.9);
        human.showInfo();
    }
}

class HumanCar{

    String color;
    String engine;

    public HumanCar(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }
}

class HumanBankAccount{

    int id;
    double balance;

    public HumanBankAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
}

class Human{

    String name;
    HumanCar car;
    HumanBankAccount bankAccount;

    void showInfo(){
        System.out.println("Name: " + name + ", Car Color: " + car.color + ", Balance: " + bankAccount.balance);
    }
}
