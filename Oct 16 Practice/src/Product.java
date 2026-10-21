public class Product{
    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    public Product(String name){
        this.name = name;
        this.price = 0.00;
    }
    public Product(){
        this.name = "Unknown Product";
        this.price = 0.00;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative");
        }
    }
    @Override
    public String toString() {
        return (name + ", " + price);
    }
}