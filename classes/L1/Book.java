import java.util.Scanner;

class Book {
    static String libraryName = "Central Library";

    String title;
    String author;
    final String isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println(libraryName);
    }

    void display(Object obj) {
        if (obj instanceof Book) {
            Book b = (Book) obj;
            System.out.println(b.title);
            System.out.println(b.author);
            System.out.println(b.isbn);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String author = sc.nextLine();
        String isbn = sc.nextLine();

        Book book = new Book(title, author, isbn);
        displayLibraryName();
        book.display(book);
    }
}
