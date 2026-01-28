package InventoryManagementSystem;

public class Link {
        Item head;
        Item tail;
        Link(){
            head=null;
            tail=null;
        }
        void addBeginning(String name,int id,int price,int quantity){
            Item n=new Item(name,id,price,quantity);
            if(head==null){
                head=n;
                tail=n;
            }else{
                n.next=head;
                head=n;
            }
        }
        void addBeginning(Item n){
            if(head==null){
                head=n;
                tail=n;
            }else{
                n.next=head;
                head=n;
            }
        }
        void addEnd(String name,int id,int price,int quantity){
            Item n=new Item(name,id,price,quantity);
            if(head==null){
                head=n;
                tail=n;
            }else{
                tail.next=n;
                tail=n;
            }
        }
        void delete(int id){
            Item slow=null;
            Item fast=head;
            while(fast!=null){
                if(fast.Id==id){
                    if(slow==null){
                        head=head.next;
                    }else{
                        slow.next=fast.next;
                    }
                }
                slow=fast;
                fast=fast.next;
            }
        }
//        void SortPrice(){
//
//        }
    void displayTotalValue(){
            Item s=head;
            while(s!=null){
                int total=s.Price*s.Quantity;
                System.out.println("Total Value is:-"+total);
                s=s.next;
            }
        }

        void updateQuantity (int id,int newQ) {
            Item s = head;
            while (s != null) {
                if(s.Id==id){
                    s.Quantity=newQ;
                }
                s=s.next;
            }
        }

}
