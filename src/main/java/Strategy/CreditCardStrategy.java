package Strategy;

public class CreditCardStrategy implements PaymentStrategy{
    private String cardHolderName;
    private String expiryDate;
    private String cvv;
    private String cardNumber;

    public CreditCardStrategy(String cardHolderName, String expiryDate, String cvv, String cardNumber) {
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit card");
    }
}
