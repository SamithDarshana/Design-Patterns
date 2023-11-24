package Payment_example;

public class Customer {

    public Customer(PaymentStrategy ps){
        this.paymentStrategy= ps;
    }

    PaymentStrategy paymentStrategy;
    public void buy(){
        System.out.println("I am buying something");
    }

    public void performPayment(){
        paymentStrategy.pay();
    }
    public void setPaymentStrategy(PaymentStrategy ps){
        paymentStrategy = ps;
    }
}
