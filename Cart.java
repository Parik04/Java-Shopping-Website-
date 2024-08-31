import java.util.ArrayList;

public class Cart {
    ArrayList<Product> myCart = new ArrayList<>();

    public void addNewItem(Product p) {
        myCart.add(p);
    }

    public void deleteItem(int p) {
        //implement to delete with name instead of index
        myCart.remove(p);
    }

    public void display() {
        int i = 0;
        for (Product el: myCart) {
            System.out.println(i + ". " + el.getProductName());
            i++;
        }
    }
    public int totalCost(){
        int cost=0;
        for(Product el: myCart){
            cost += el.getPrice()*el.getQuantity();
        }
        return cost;
    }
}
