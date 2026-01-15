class Item {
    private int itemCode;
    private String itemName;
    private double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public void displayDetails(int quantity) {
        System.out.println(itemCode);
        System.out.println(itemName);
        System.out.println(calculateTotalCost(quantity));
    }
}

public class Main {
    public static void main(String[] args) {
        Item item = new Item(201, "Pen", 10);
        item.displayDetails(5);
    }
}
