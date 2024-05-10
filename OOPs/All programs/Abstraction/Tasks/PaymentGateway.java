// Design an interface called "PaymentGateway" with methods like "processPayment" and "refundPayment." Implement classes like "PayPalGateway" and "StripeGateway" that provide specific implementations for these interface methods.



interface PaymentGateways{
    void processPayment();
    void refundPayment();
}

class PayPalGateway implements PaymentGateways{
    @Override
    public void processPayment(){
        System.out.println("Processing payment in PayPal!!");
    }
    @Override
    public void refundPayment(){
        System.out.println("Refunding payment in PayPal!!");
    } 

}

class StripeGateway implements PaymentGateways{
    @Override
    public void processPayment(){
        System.out.println("Processing payment in Stripe!!");
    }

    @Override
    public void refundPayment(){
        System.out.println("Refunding payment in Stripe!!");
    }
}

public class PaymentGateway {
    public static void main(String[] args) {
        PayPalGateway p = new PayPalGateway();
        StripeGateway s = new StripeGateway();

        p.processPayment();
        p.refundPayment();
        s.processPayment();
        s.refundPayment();
    }
}
