import java.util.Scanner;

class Product {
    static double discount = 10.0;

    String productName;
    double price;
    int quantity;
    final int productID;

    Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void display(Object obj) {
        if (obj instanceof Product) {
            Product p = (Product) obj;
            System.out.println(p.productName);
            System.out.println(p.price);
            System.out.println(p.quantity);
            System.out.println(p.productID);
            System.out.println(discount);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double price = sc.nextDouble();
        int qty = sc.nextInt();
        int id = sc.nextInt();

        Product p = new Product(name, price, qty, id);
        p.display(p);
    }
}
