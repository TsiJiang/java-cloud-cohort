import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Student("Xavier", 36, "Java Web Dev"));
        people.add(new Student("Michael", 40, "BCIS"));
        people.add(new Teacher("Mark", 46, "Spring Room"));
        people.stream().forEach(Person::greet);
        */
        /*
        Car honda = new Car();
        honda.start();
        honda.honk();
         */
        /*
        Car tesla = new Car(new ElectricMotor());
        tesla.start();
         */
        Order myOrder = new Order("Xavier L.");
        myOrder.addProduct(new Electronic("MacBook Pro", 1499.99, 3.0));
        myOrder.addProduct(new Book("Harry Potter and the Sorcerer's Stone", 24.99, "J.K. Rowling"));
        myOrder.addProduct(new Product("Dawn Dish Soap", 4.99));
        myOrder.addProduct(new Product("Chunky Beef Soup", 3.29));
        myOrder.addProduct(new Product("Whole Wheat Seeded Bread", 4.49));
        myOrder.addProduct(new Product("Organic Whole Milk", 4.69));
        myOrder.addProduct(new Product("Extra Virgin Olive Oil", 11.99));
        myOrder.addProduct(new Product("Multivitamin Tablets", 14.59));
        myOrder.addProduct(new Product("Wild Caught Salmon Filet", 16.99));
        myOrder.getProducts().forEach(System.out::println);
        System.out.printf("==================================%n%-24s %11s","Subtotal:", "$%,.2f".formatted(myOrder.getTotalPrice()));
        System.out.println();

    }
}