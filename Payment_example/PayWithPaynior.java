package Payment_example;

public class PayWithPaynior implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("I am pay with Paynior");
    }
}
