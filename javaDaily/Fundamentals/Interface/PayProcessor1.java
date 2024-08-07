
interface PaymentProcessor1 {
    void processPayment(int amount);

    default void success() {
        System.out.println("Payment successful");
    }

    default void failed() {
        System.out.println("Payment failed");
    }
}

class RazorpayPayment implements PaymentProcessor1 {
    @Override
    public void processPayment(int amt) {
        System.out.println("Razorpay Payment made : "+amt);
    }
}

class GpayPayment implements PaymentProcessor1 {
    @Override
    public void processPayment(int amt) {
        System.out.println("Gpay payment made : "+amt);
    }
}

public class PayProcessor1 {
    public static void main(String[] args) {
        RazorpayPayment razorpayPayment = new RazorpayPayment(); //Uses specific implementation
        razorpayPayment.processPayment(200); //Direct access to methods are possible
        razorpayPayment.failed(); //using specific implementation instead of using polymorphic supported

        GpayPayment gpayPayment = new GpayPayment(); //Need to manually change different implementation if needed
        gpayPayment.processPayment(200);
        gpayPayment.success();
    }
}
