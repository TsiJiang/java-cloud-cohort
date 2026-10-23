import java.util.ArrayList;

// Week 6 Wednesday: in-class practice for abstract classes and interfaces.
// The file compiles and runs as given. Do each TODO when Sean says so.
// After each TODO: compile, read the error if there is one, fix it, run.

// ===== Exercise 1: an abstract class =====

abstract class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    abstract void sound();              // no body: every non-abstract child must write it

    void breathe() {                    // a normal method every child gets
        System.out.println(getName() + " is breathing...");
    }
}

class Dog extends Animal {              // a finished example
    Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(getName() + ": Bark");
    }
}

// TODO 1: uncomment the two lines below and compile. Fix each error the compiler
//         reports until Bird compiles. A bird says "Tweet".
//         Then uncomment the TODO 1 line in main.
class Bird extends Animal {
    Bird(String name) {
        super(name);
    }
    /* Bird(){
        super("Unknown Bird");
    } */

    @Override
    void sound() {
        System.out.println(getName() + ": Chirp");
    }

}

// ===== Exercise 2: an interface =====

interface Payment {
    public abstract void process(double amount);
    public static void receipt(){
        System.out.println("Thank you");
    }
}

class CreditCardPayment implements Payment {
    public void receipt(){
        Payment.receipt();
    }
    @Override
    public void process(double amount) {
        System.out.printf("Processing credit card payment of $%,.2f\n", amount);
    }
}

// TODO 2: write  class CashPayment implements Payment.  Its process() prints
//         "Paid $<amount> in cash". Then uncomment the TODO 2 line in main.
class CashPayment implements Payment {
    public void receipt(){
        Payment.receipt();
    }
    @Override
    public void process(double amount) {
        System.out.printf("Paid %s in cash.\n", "$%,.2f".formatted(amount));
    }
}
class Store {
    void checkout(Payment p, double amount) {      // takes ANY Payment
        p.process(amount);
    }
}

// ===== Exercise 3: one parent class, plus an interface =====

abstract class Vehicle {
    private String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    String getBrand() {
        return brand;
    }

    abstract void start();
}

interface Chargeable {
    void charge();
}

class Phone implements Chargeable {     // a finished example: it can charge, but it is not a Vehicle
    @Override
    public void charge() {
        System.out.println("Phone charging over USB-C");
    }
}

// TODO 3: write  class ElectricScooter  that IS A Vehicle and CAN charge.
//         start() prints "<brand> scooter started"; charge() prints "<brand> scooter charging".
//         Then uncomment the three TODO 3 lines in main.
class ElectricScooter extends Vehicle implements Chargeable {
    public ElectricScooter(String brand) {
        super(brand);
    }

    @Override
    void start(){
        System.out.println( getBrand() + " scooter started, silently");
    }

    @Override
    public void charge() {
        System.out.println(getBrand() + " scooter charging");
    }
}
abstract class Shape{
    abstract double area();
}
class Circle extends Shape{
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double area(){
        return Math.PI * radius * radius;
    }
}

public class Week6WedPractice {
    public static void main(String[] args) {

        System.out.println("--- 1. Animals ---");
        ArrayList<Animal> zoo = new ArrayList<>();
        zoo.add(new Dog("Rex"));
        zoo.add(new Bird("Tweety"));                            // TODO 1
        for (Animal a : zoo) {
            a.sound();
        }

        System.out.println("--- 2. Payments ---");
        Store store = new Store();
        store.checkout(new CreditCardPayment(), 20.0);
        new CreditCardPayment().receipt();
        store.checkout(new CashPayment(), 20.0);    // TODO 2
        new CashPayment().receipt();

        System.out.println("--- 3. Things that charge ---");
        ArrayList<Chargeable> plugs = new ArrayList<>();
        plugs.add(new Phone());
        ElectricScooter scooter = new ElectricScooter("Metro"); // TODO 3
        scooter.start();                                        // TODO 3
        plugs.add(scooter);                                     // TODO 3

        // TODO 4, only if there is time: add a lamp to plugs with a lambda, no class.
        //         Chargeable lamp = () -> ...
        Chargeable lamp = () -> System.out.println("Lamp charging");
        plugs.add(lamp);
        for (Chargeable c : plugs) {
            c.charge();
        }
    }
}