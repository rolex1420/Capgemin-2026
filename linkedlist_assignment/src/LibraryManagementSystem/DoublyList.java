package LibraryManagementSystem;


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
            head.pre=n;
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
            n.pre=tail;
            tail=n;
        }
    }
    void removeBook(int id){
        Book temp=head;
        while(temp!=null){
            if(temp.Id==id){
                if(temp.pre!=null){
                    temp.pre.next=temp.next;
                }else{
                    head=head.next;
                    head.pre=null;
                }
            }
            temp=temp.next;
        }
    }
    void bookSearch(String Auther){
        Book temp=head;
        while(temp!=null){
            if(temp.Author==Auther){
                System.out.println(temp.Title);
                System.out.println(temp.Id);
                System.out.println(temp.Author);
                System.out.println(temp.AvailabilityStatus+"\n");
            }
            temp=temp.next;
        }
    }
    void updateavailability(int id){
        Book temp=head;
        while(temp!=null) {
            if (temp.Id == id) {
                temp.AvailabilityStatus=!temp.AvailabilityStatus;
            }
            temp=temp.next;
        }
    }
    void displayAllBook(){
        Book temp=head;
        System.out.println("All Books \n");
        while(temp!=null) {
            System.out.println(temp.Title);
            System.out.println(temp.Id);
            System.out.println(temp.Author);
            System.out.println(temp.AvailabilityStatus+"\n");
            temp=temp.next;
        }
    }
}
