package AbstractionPractice;

//this program demonstrates abstraction using an abstract class

//this is an abstract class named BankAccount
abstract class BankAccount {
    //this is an abstract method to be implemented by subclasses
    abstract void calculateInterest();

    //this is a regular method that displays account type
    void accountType() {
        System.out.println("This is a bank account");
    }
}

//this is a concrete class named SavingsAccount that extends BankAccount
class SavingsAccount extends BankAccount {
    //this is the implementation of the abstract method
    void calculateInterest() {
        System.out.println("Interest for savings account is 4% annually");
    }
}

//this is the main class
public class AbstractClassDemo {
    public static void main(String[] args) {
        //this creates an object of SavingsAccount
        SavingsAccount myAccount = new SavingsAccount();

        //this calls the implemented method
        myAccount.calculateInterest();

        //this calls the method from abstract class
        myAccount.accountType();
    }
}
