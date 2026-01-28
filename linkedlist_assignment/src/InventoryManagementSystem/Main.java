package InventoryManagementSystem;

public class Main {
    static void main(String[] args) {
        Link p1=new Link();
        p1.addBeginning("sura",2,200,2);
        p1.addBeginning("sura",1,100,1);
        p1.addBeginning("sura",3,300,3);
        p1.addEnd("sura",4,400,4);
        p1.displayTotalValue();
    }
}
