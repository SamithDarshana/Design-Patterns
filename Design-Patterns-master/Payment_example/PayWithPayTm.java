package Payment_example;

public class PayWithPayTm implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("I am paying with PayTm");
    }
}
