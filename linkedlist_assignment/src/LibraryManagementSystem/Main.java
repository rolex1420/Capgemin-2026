package LibraryManagementSystem;

public class Main {
    static void main(String[] args) {
        DoublyList list1 = new DoublyList();
        list1.addBeginning(2,"def","b","zxc",true);
        list1.addBeginning(1,"abc","a","asd",true);
        list1.addEnd(3,"ghi","c","qwe",false);
        list1.displayAllBook();
        list1.removeBook(2);
        list1.displayAllBook();
    }
}
