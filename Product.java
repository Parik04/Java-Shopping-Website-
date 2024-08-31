public class Product {
    private String productName;
    private int price;
    private int quantity;

    public Product(String name, int q, int p) {
        productName = name;
        price = p;
        quantity = q;
    } 
    // add conditions to check for negative values
    
    public int getQuantity() {
        return this.quantity;
    }
    
    public int getPrice() {
        return this.price;
    }

    public String getProductName() {
        return productName;
    }





}