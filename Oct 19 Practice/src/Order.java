import java.util.ArrayList;

public class Order {
    private String customerName;
    private ArrayList<Product> products = new ArrayList<>();

    public Order(String customerName){
        setCustomerName(customerName);
    }
    public Order(){
        setCustomerName("Unknown Customer");
    }
    public ArrayList<Product> getProducts() {
        return products;
    }
    public void addProduct(Product product){
        products.add(product);
    }
    public void removeProduct(Product product){
        products.remove(product);
    }
    public void removeProduct(int index){
        products.remove(index);
    }
    public void removeProduct(String productName){
        products.removeIf(product -> product.getName().equals(productName));
    }
    public void removeAllProducts(){
        products.clear();
    }
    public double getTotalPrice(){
        double totalPrice = 0;
        for(Product product : products){
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


}
