import java.util.Scanner;

public class ATM {
    private double balance = 10000.0;
    private final String accNo = "01810578089";
    private final int password = 1234;

    public void deposit(String acc, int pass, double amount) {
        if(!acc.contentEquals(accNo) || !(password == pass)){
            System.out.println("Incorrect Account No or Password!");
            return;
        }
        balance += amount;
        System.out.println("Tk. " + amount + " Deposited Successfully!");
    }

    public void withdraw(String acc, int pass, double amount){
        if(!acc.contentEquals(accNo) || !(password == pass)){
            System.out.println("Incorrect Account No or Password!");
            return;
        }
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdrawal Tk. " + amount + " Successful!");
        }
        else{
            System.out.println("Insufficient balance!");
        }
    }

    public void checkBalance(String acc, int pass) {
        if(!acc.contentEquals(accNo) || !(password == pass)){
            System.out.println("Incorrect Account No or Password!");
            return;
        }
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner sc = new Scanner(System.in);
        String acc;
        double amount;
        int pin;
        while(true) {
            System.out.println("\n1.Deposit 2.Withdraw 3.Balance 4.Exit");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.print("Enter Account No: ");
                    acc = sc.next();
                    System.out.print("Enter Pin Code: ");
                    pin = sc.nextInt();
                    System.out.print("Enter Deposit Amount: ");
                    amount  = sc.nextDouble();
                    atm.deposit(acc, pin, amount);
                    break;
                case 2:
                    System.out.print("Enter Account No: ");
                    acc = sc.next();
                    System.out.print("Enter Pin Code: ");
                    pin = sc.nextInt();
                    System.out.print("Enter Withdrawal Amount: ");
                    amount  = sc.nextDouble();
                    atm.withdraw(acc, pin, amount);
                    break;
                case 3:
                    System.out.print("Enter Account No: ");
                    acc = sc.next();
                    System.out.print("Enter Pin Code: ");
                    pin = sc.nextInt();
                    atm.checkBalance(acc, pin);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}