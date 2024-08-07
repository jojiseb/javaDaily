
interface PaymentProcessor {
    void processPayment(int amount);

    default void success() {
        System.out.println("Payment successful");
    }

    default void failed() {
        System.out.println("Payment failed");
    }
}

class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void processPayment(int amount) {
        System.out.println("Payment by credit card : "+amount);
    }

    @Override
    public void success() {
        System.out.println("Credit Card Payment Successful");
    }

    @Override
    public void failed() {
        System.out.println("Credit Card payment failed");
    }
}

class PaypalProcessor implements PaymentProcessor {

    @Override
    public void processPayment(int amount) {
        System.out.println("Payment by Paypal : "+amount);
    }
}

public class PayProcessor {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaypalProcessor(); //Used reference variable is interface type , but instance referred is Implemented Class
        paymentProcessor.processPayment(20000);  //This is to enable polymorphism, considering future changes in implementations
        paymentProcessor.success(); //Show the implemented success method

        paymentProcessor = new CreditCardProcessor();
        paymentProcessor.processPayment(30000);
        paymentProcessor.failed();  //Show default implementation since there is no
                                    //custom implementation added/overridden in implemented class
    }
}
