class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(int qty) {
        quantity += qty;
    }

    public void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
        }
    }

    public void displayTotalCost() {
        System.out.println(price * quantity);
    }
}

public class Main {
    public static void main(String[] args) {
        CartItem item = new CartItem("Laptop", 50000, 1);
        item.addItem(1);
        item.removeItem(1);
        item.displayTotalCost();
    }
}
