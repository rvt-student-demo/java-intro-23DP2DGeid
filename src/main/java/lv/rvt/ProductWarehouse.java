package lv.rvt;

public class ProductWarehouse extends Warehouse{
    public String productName;
    private double balance;
    public ProductWarehouse(String productName, double capacity){
        super(capacity);
        this.productName = productName;
        this.capacity = capacity;
    }
    public String getName(){
        return productName;
    }
    public void setName(String newName){
        this.productName = newName;
    }
    public String toString(){
        return productName + ":" +  "balance = " + this.balance + ", space left " + howMuchSpaceLeft();
    }
}
