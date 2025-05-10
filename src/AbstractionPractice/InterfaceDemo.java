//this program demonstrates abstraction using an interface
//this is an interface named PaymentGateway
package AbstractionPractice;
interface PaymentGateway {
    //this is an abstract method to process a payment
    void processPayment(double amount);

    //this is another abstract method to generate a receipt
    void generateReceipt();
}

//this is a class named PayPal that implements the PaymentGateway interface
class PayPal implements PaymentGateway {
    //this is the implementation of processPayment method
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through PayPal");
    }

    //this is the implementation of generateReceipt method
    public void generateReceipt() {
        System.out.println("Generating receipt from PayPal");
    }
}

//this is the main class
public class InterfaceDemo {
    public static void main(String[] args) {
        //this creates an object of PayPal
        PayPal payment = new PayPal();

        //this calls the processPayment method
        payment.processPayment(99.99);

        //this calls the generateReceipt method
        payment.generateReceipt();
    }
}
