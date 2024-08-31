import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    
    ArrayList<Product> catalogue = new ArrayList<>();

    public void addNewItem(Product p) {
        catalogue.add(p);
    }

    public void deleteItem(int p) {
        //implement to delete with name instead of index
        catalogue.remove(p);
    }



    //scanner obj
    Scanner sc = new Scanner(System.in);

    public int display() {
        int i = 1;
        for (Product el: catalogue) {
            System.out.println(i + ". " + el.getProductName());
            i++;
        }

        System.out.println("0 for view cart");
        System.out.println("Item Number for adding item to cart");
        int ans = sc.nextInt();

        return ans;
    }

    

}
