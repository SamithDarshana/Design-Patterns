package Payment_example;

public class Main {

    PayWithPaynior payWithPaynior = new PayWithPaynior();
    static PayWithPayPal payWithPayPal = new PayWithPayPal();
    PayWithPayTm payWithPayTm = new PayWithPayTm();
    public static void main(String[] args) {
        Customer customer = new Customer(payWithPayPal);
        customer.buy();
        customer.performPayment();
        customer.setPaymentStrategy(new PayWithPayTm());
        customer.performPayment();
    }
}
