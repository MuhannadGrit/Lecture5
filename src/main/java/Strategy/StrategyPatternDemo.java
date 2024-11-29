package Strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        ShoppingContext shoppingContext = new ShoppingContext(new PaypalStrategy(
                "muhannad.satouf@gritacademy.se",
                "asdqwezxc123456"));

        shoppingContext.executePayment(123);

        shoppingContext = new ShoppingContext(new CreditCardStrategy(
                "Muhannad Satouf",
                "2025-10-10",
                "123" ,
                "123456789852"));
        shoppingContext.executePayment(554);
    }
}
