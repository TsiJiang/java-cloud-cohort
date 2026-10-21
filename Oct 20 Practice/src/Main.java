public class Main{
    public static void main(String[] args){
        CardPayment card = new CardPayment("123456781234", "Xavier Long");
        CryptoPayment crypto = new CryptoPayment("0x71C...3a9", "BTC");
        card.pay(1499.99);
        crypto.pay(59.99);
    }
}