
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Product p1 = new Product("Book", 1, 100);
        Product p2 = new Product("Pen", 2, 10);
        Product p3 = new Product("bat", 2, 10);
        Product p4 = new Product("ball", 2, 10);
        Product p5 = new Product("phone", 2, 10);
        Product p6 = new Product("apple", 2, 10);
        Product p7 = new Product("bottle", 2, 10);
        Product p8 = new Product("pouch", 2, 10);
        Scanner sc = new Scanner(System.in);
        //String n = sc.next();

        ArrayList<Product> floormart = new ArrayList<>();
        floormart.add(p1);
        floormart.add(p2);
        floormart.add(p3);
        floormart.add(p4);
        floormart.add(p5);
        floormart.add(p6);
        floormart.add(p7);
        floormart.add(p8);

        //example product
        Cart c1 = new Cart();

        System.out.println("Hello, enter your name");
        //Scanner sc = new Scanner(System.in);
        String customerName = sc.next();

        System.out.println("Hi" + customerName + "choose from the following:");
        System.out.println("1 for viewing catalogue");
        System.out.println("2 for viewing your cart");
        int answer = sc.nextInt();

        if (answer == 1) {
            int i = 1;
            for (Product el : floormart) {
                System.out.println(i + ". " + el.getProductName());
                i++;
            }
            System.out.println("enter item number you want to add");
            int ans = sc.nextInt();
            c1.addNewItem(floormart.get(ans - 1));
            System.out.println("Item added");
            for(int it=0;it<5;it++){
                System.out.println("1 for add another item, 2 for check out");
                int ans2 = sc.nextInt();
                if(ans2 == 1){
                    i=1;
                    for (Product el : floormart) {
                        System.out.println(i + ". " + el.getProductName());
                        i++;
                    }
                    System.out.println("enter item number");
                    int itemno = sc.nextInt();
                    c1.addNewItem(floormart.get(itemno-1));
                }
                else{
                    c1.display();
                    System.out.println("Total Cost: " + c1.totalCost());
                    break;
                }
            }
            
        } else if (answer == 2) {
            c1.display();
        }
        System.out.println("Thankyou for shopping with us!! Do visit again");
    }

}
