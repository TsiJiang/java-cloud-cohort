import java.util.ArrayList;

class Server{
    private String region;
    private boolean isActive;

    public Server(String region){
        this.region = region;
    }

    void start(){
        if (!isActive){
            isActive = true;
        }
    }

    @Override
    public String toString(){
        return region + ": " + isActive;
    }
}
class Telemetry{
    private ArrayList<Double> logs = new ArrayList<>(); //use composition

    public void addLog(double km){
        logs.add(km);
    }
    public String readLogs(){
        String allLogs = "";
        for (double log : logs){
            allLogs = allLogs.concat(log + " km\n");
        }
        return allLogs;
    }
}
interface PaymentMethod {
    void pay(double amount);
}

class PaymentFactory {

    // Static factory method to instantiate the correct Payment object
    public static PaymentMethod of(String type,
                                   String cardNumber,
                                   String cardHolder,
                                   String coinType,
                                   String walletAddress) {
        if (type == null) {
            return null;
        }

        return (PaymentMethod) switch (type.toLowerCase().trim()) {
            case "credit", "card" -> new CardPayment(cardNumber, cardHolder);
            case "crypto", "bitcoin" -> new CryptoPayment(coinType, walletAddress);
            default -> throw new IllegalArgumentException("Unknown payment method type: " + type);
        };
    }
}
public class Main {
    static void main(String[] args) {
//        Server server = new Server("San Francisco");
//        System.out.println(server);
//        server.start();
//        System.out.println(server);
//        Telemetry telemetry = new Telemetry();
//        telemetry.addLog(5);
//        telemetry.addLog(1);
//        telemetry.addLog(2);
//        telemetry.addLog(3);
//        System.out.println(telemetry.readLogs());
        // 1. Requesting a Credit payment (properly instantiates with number and holder strings)
        PaymentMethod creditPayment = PaymentFactory.of("credit", "4111-2222-3333-4444", "Xavier Long", null, null);
        creditPayment.pay(250.00);

        // 2. Requesting a Crypto payment (ignores the card fields during switch block dispatch)
        PaymentMethod cryptoPayment = PaymentFactory.of("crypto", null, null, "Solana", "Ab3x...7q9Z");
        cryptoPayment.pay(1.25);
    }
}
