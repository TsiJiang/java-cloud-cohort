public class Electronic extends Product{
    private Double warranty;
    public Electronic(String name, Double price, Double warranty){
        super(name, price);
        setWarranty(warranty);


    }
    public Double getWarranty() {
        return warranty;
    }
    public void setWarranty(Double warranty) {
        if (warranty>0){
            this.warranty = warranty;
        } else {
            System.out.println("Invalid Warranty Amount");
        }
    }
}
