package Payment_example;

public class PayWithPayPal implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("I am paying with PayPal");
    }
}
