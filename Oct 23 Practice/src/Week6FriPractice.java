import java.util.ArrayList;

// Week 6 Friday: in-class practice, modeling a Tesla back end.
// The file compiles and runs as given. Do each TODO when Sean says so.
// After each TODO: compile, read the error if there is one, fix it, run.

// ===== Given: an abstract Vehicle and a Battery =====

abstract class Vehicle {
    private final String vin;
    private String model;
    private int year;

    protected Vehicle(String vin, String model, int year) {
        this.vin = vin;
        this.model = model;
        this.year = year;
    }

    public String getVin() { return vin; }
    public String getModel() { return model; }
    public int getYear() { return year; }

    public abstract void diagnostics();
}

class Battery {
    private int capacity;   // kWh
    private int health;     // %

    Battery(int capacity, int health) {
        this.capacity = capacity;
        this.health = health;
    }

    void healthCheck() {
        System.out.println("  Battery health: " + health + "%");
    }

    int getCapacity() { return capacity; }
}
class ChargingStation {
    private String location;
    private boolean available = true;

    ChargingStation(String location) {
        this.location = location;
    }

    void startCharging(TeslaCar car) {
        if (available) {
            System.out.println("Charging Tesla " + car.getVin() + " at " + location);
            available = false;
        } else {
            System.out.println("Station busy at " + location);
        }
    }

    void stopCharging() {
        available = true;
    }
}
interface Payment {
    void process(double amount);
}

class CardPayment implements PaymentMethod {
    private final String cardNumber;
    private final String cardHolder;

    public CardPayment(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment of $" + amount + " from " + cardHolder);
    }
}

class CryptoPayment implements PaymentMethod {
    private final String walletAddress;
    private final String coinType;

    public CryptoPayment(String walletAddress, String coinType){
        this.walletAddress = walletAddress;
        this.coinType = coinType;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Processing "+ coinType +" crypto payment of $" + "%,.2f".formatted(amount) + " from "  + walletAddress);
    }
}

// TODO 1: uncomment the two lines below. A TeslaCar IS A Vehicle and HAS A Battery.
//         Give it a private Battery field and a constructor (vin, model, year, battery).
//         diagnostics() prints "Running diagnostics on Tesla <vin>", then asks its battery
//         for a healthCheck(). Then uncomment the TODO 1 lines in main.
 class TeslaCar extends Vehicle {
    private Battery battery;
    private SoftwareUpdate update;

    public TeslaCar(String vin, String model, int year, Battery battery) {
        super(vin, model, year);
        this.battery = battery;
        this.update = new SoftwareUpdate("FactoryDefault");
    }

    @Override
    public void diagnostics() {
        System.out.println("Running diagnostics on Tesla " + getVin() + "..." );
        battery.healthCheck();
    }
    @Override
    public String toString() {
        return getVin() + " " + getModel() + " " + getYear() + " " + update.getVersion();
    }

    public void UpdateSoftware(SoftwareUpdate update) {
        this.update.installUpdate(update.getVersion());
        this.update = update;
    }
}

// ===== Given: an abstract User and a Driver =====

abstract class User {
    private String name;
    private String email;

    User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    String getName() { return name; }

    abstract void accessSystem();
}

class Driver extends User {
    Driver(String name, String email) {
        super(name, email);
    }

    @Override
    void accessSystem() {
        System.out.println(getName() + " is driving with personalized settings.");
    }
}

// TODO 2: write  class Technician  that IS A User. accessSystem() prints
//         "<name> is performing diagnostics." Then uncomment the TODO 2 line in main.
class Technician extends User {
    Technician(String name, String email) {
        super(name, email);
    }
    @Override
    void accessSystem() {
        System.out.println(getName() + " is performing diagnostics.");
    }
}

// TODO 3 (after TODO 1): uncomment the class below and fill in both methods.
//         A FleetManager HAS MANY TeslaCars. Then uncomment the TODO 3 lines in main.
 class FleetManager {
     private ArrayList<TeslaCar> fleet = new ArrayList<>();

     void addCar(TeslaCar car) {
         fleet.add(car);
     }

     void runDiagnostics() {
         fleet.forEach(TeslaCar::diagnostics);
     }
     void softwareUpdate(SoftwareUpdate update) {
         fleet.forEach(car -> car.UpdateSoftware(update));
     }
//
//     // TODO 4, only if there is time: a sortByYear() method that sorts the fleet,
//     //         oldest first, with a lambda:  fleet.sort((a, b) -> ...);
    void sortByYear(){
         fleet.sort((a,b)->Integer.compare(a.getYear(),b.getYear()));
    }
    @Override
    public String toString(){
         String s = "";
         for  (TeslaCar car : fleet) {
             s = s.concat(car + "\n");
         }
         return s;
    }
}
interface Updatable {
    void installUpdate(String version);
}

class SoftwareUpdate implements Updatable {
    private String version;

    public SoftwareUpdate(String version) {
        this.version = version;
    }

    public void installUpdate(String version) {
        this.version = version;
        System.out.println("Installing Tesla software update: " + version);
    }
    public String getVersion(){
        return version;
    }
}

public class Week6FriPractice {
    public static void main(String[] args) {

        System.out.println("--- 1. A TeslaCar ---");
        Battery battery = new Battery(75, 92);
        battery.healthCheck();
        TeslaCar tesla = new TeslaCar("VIN001", "Model 3", 2019, battery);     // TODO 1
        tesla.diagnostics();                                                  // TODO 1

        System.out.println("--- 2. Users ---");
        ArrayList<User> users = new ArrayList<>();
        users.add(new Driver("Alice", "alice@example.com"));
        users.add(new Technician("Bob", "bob@example.com"));                  // TODO 2
        for (User u : users) {
            u.accessSystem();
        }

        System.out.println("--- 3. A fleet ---");
        FleetManager manager = new FleetManager();                            // TODO 3
        manager.addCar(tesla);                                                // TODO 3
        manager.addCar(new TeslaCar("VIN002", "Model S", 2021, new Battery(100, 88)));
        manager.addCar(new TeslaCar("VIN003", "Model 3", 2022, new Battery(82, 91)));
        manager.addCar(new TeslaCar("VIN004", "Model Y", 2023, new Battery(75, 95)));
        manager.addCar(new TeslaCar("VIN005", "Model X", 2020, new Battery(100, 84)));
        manager.addCar(new TeslaCar("VIN006", "Model 3", 2021, new Battery(60, 87)));
        manager.addCar(new TeslaCar("VIN007", "Model S", 2024, new Battery(100, 98)));
        manager.addCar(new TeslaCar("VIN008", "Model Y", 2022, new Battery(82, 89)));// TODO 3
        manager.runDiagnostics();                                             // TODO 3
        manager.sortByYear();
        SoftwareUpdate v20261023os = new SoftwareUpdate("v20261023");
        manager.softwareUpdate(v20261023os);
        System.out.println(manager);






    }
}
