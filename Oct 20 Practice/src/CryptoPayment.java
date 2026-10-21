public class CryptoPayment implements PaymentMethod {
    private final String walletAddress;
    private final String coinType;

    public CryptoPayment(String walletAddress, String coinType){
        this.walletAddress = walletAddress;
        this.coinType = coinType;
    }

    @Override
    public boolean pay(double amount){
        System.out.printf("Processing %s payment of %s via wallet %s\n", coinType, "$%,.2f".formatted(amount), walletAddress);
        return true;
    }
}
