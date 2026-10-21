import java.util.*;

public class Main{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("keep","drop","keep"));
        /*
        for (int i = 0; i < list.size(); i++) { //Was originally "String s : list" which is concurrent modification
            if (list.get(i).equals("drop")) {
                list.remove(i);
            }
        }
        */ //This is also bad
        Iterator<String> me = list.iterator();
        while(me.hasNext()){
            if (me.next().equals("drop")){
                me.remove();
            }
        }

        //list.stream().forEach(System.out::println);
        ArrayList<Product> inventory = new ArrayList<>();
        inventory.add(new Product("Chunky Beef Soup", 3.29));
        inventory.add(new Product("Whole Wheat Seeded Bread", 4.49));
        inventory.add(new Product("Organic Whole Milk", 4.69));
        inventory.add(new Product("Extra Virgin Olive Oil", 11.99));
        inventory.add(new Product("Multivitamin Tablets", 14.59));
        inventory.add(new Product("Wild Caught Salmon Filet", 16.99));
        double priceAverage = 0.0;
        for(Product product : inventory){
            priceAverage += product.getPrice();
        }
        priceAverage /= inventory.size();
        System.out.printf("Average: $%,.2f%n", priceAverage);
        Iterator<Product> it = inventory.iterator();
        while(it.hasNext()){
            Product product = it.next();
            if (product.getPrice() < 10.0 ) {
                it.remove();
            }
        }
        //create comparator to sort products in inventory by price ascending
        inventory.sort((o1, o2) -> Double.compare(o2.getPrice(), o1.getPrice()));
        //Print final list
        inventory.forEach(System.out::println);
    }
}