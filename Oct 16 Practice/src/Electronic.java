public class Electronic extends Product{
    private double warranty;
    public Electronic(String name, double price, double warranty) {
        super(name, price);
        if (warranty > 0.0){
            this.warranty = warranty;
        }
    }
    public double getWarranty() {
        return warranty;
    }
    public void setWarranty(double warranty) {
        if  (warranty > 0.0){
            this.warranty = warranty;
        }
    }
}