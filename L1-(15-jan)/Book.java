class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
    }
}

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Java Basics", "James", 499);
        book.displayDetails();
    }
}
