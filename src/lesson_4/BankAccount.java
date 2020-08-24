package lesson_4;

/**
 * @author Alex Komanov
 */
public class BankAccount {

    int id;
    String name;
    double balance;
}

class MainBankAccount{
    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount();
        BankAccount hisAccount = new BankAccount();
        BankAccount yourAccount = new BankAccount();

        myAccount.id = 1;
        myAccount.name = "Alex";
        myAccount.balance = 1_564_561;

        System.out.println("My name is " + myAccount.name + ", I have id number " + myAccount.id + ", and " +
                "the balance of " + myAccount.balance + ".");

        //Default values
        System.out.println(hisAccount.name);
        System.out.println(hisAccount.id);
        System.out.println(hisAccount.balance);
    }
}
