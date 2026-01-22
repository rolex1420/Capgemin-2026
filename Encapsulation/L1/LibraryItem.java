// LibraryItem.java
abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int id, String title, String author) {
        this.itemId = id;
        this.title = title;
        this.author = author;
    }

    abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println(title + " by " + author);
    }
}

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

class Book extends LibraryItem {
    public Book(int id, String title, String author) {
        super(id, title, author);
    }

    int getLoanDuration() {
        return 14;
    }
}
