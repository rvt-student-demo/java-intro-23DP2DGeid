package lv.rvt;

public class Product {
    private int quant;
    private double price;
    private String name;
    public Product (String initialName, double initialPrice, int initialQuantity){

        this.name = initialName;
        this.price = initialPrice;
        this.quant = initialQuantity;

        

    }
    public void printProduct(){
        System.out.println(this.name + ", " + price + ", " + quant);
    }

}
