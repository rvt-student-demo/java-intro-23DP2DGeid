package lv.rvt;

public class ProductWarehouseWithHistory extends ProductWarehouse {
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        this.productName = productName;
        this.capacity = capacity;
    }
    public String history(){
        
    }
}
