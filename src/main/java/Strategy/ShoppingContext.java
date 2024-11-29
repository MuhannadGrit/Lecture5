package Strategy;

public class ShoppingContext {
    private PaymentStrategy paymentStrategy;

    public ShoppingContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(int amount){
        paymentStrategy.pay(amount);
    }
}
