package InventoryManagementSystem;

public class Item {
    String Name;
    int Id;
    int Price;
    int Quantity;
    Item next;
    Item(String Name,int Id,int Price,int Quantity){
        this.Name=Name;
        this.Id=Id;
        this.Price=Price;
        this.Quantity=Quantity;
        this.next=null;
    }
}
