package LibraryManagementSystem;

import InventoryManagementSystem.Item;

public class DoublyList {
    Book head,pre,tail;
    DoublyList(){
        head=null;
        pre=null;
        tail=null;
    }
    void addBeginning(int id,String Title,String Author,String Genre,boolean availabilityStatus){
        Book n=new Book(id,Title,Author,Genre,availabilityStatus);
        if(head==null){
            head=n;
            tail=n;
        }else{
            n.pre=
            n.next=head;
            head=n;
        }
    }
    void addEnd(int id,String Title,String Author,String Genre,boolean availabilityStatus){
        Book n=new Book(id,Title,Author,Genre,availabilityStatus);
        if(head==null){
            head=n;
            tail=n;
        }else{
            tail.next=n;
            tail=n;
        }
    }
}
