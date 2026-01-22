import java.util.*;

class Product {
    String name;

    Product(String name) {
        this.name = name;
    }
}

class Order {
    List<Product> products = new ArrayList<>();

    void addProduct(Product p) {
        products.add(p);
    }
}

class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }

    void placeOrder(Order o) {
        o.products.size();
    }
}

public class Main {
    public static void main(String[] args) {
        Customer c = new Customer("Asha");
        Order o = new Order();
        o.addProduct(new Product("Laptop"));

        c.placeOrder(o);
    }
}
