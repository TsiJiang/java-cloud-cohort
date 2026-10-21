public class CardPayment implements PaymentMethod{
    private final String cardNumber;
    private final String cardHolder;

    public CardPayment(String cardNumber, String cardHolder){
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public boolean pay(double amount){
        System.out.printf("Processing Card payment of %s for %s\n", "$%,.2f".formatted(amount), cardHolder);
        return true;
    }
}
