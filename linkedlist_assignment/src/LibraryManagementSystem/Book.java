package LibraryManagementSystem;

public class Book {
    int Id;
    String Title;
    String Author;
    String Genre;
    boolean AvailabilityStatus;
    Book pre,next;
    Book(int id,String title,String author,String genre,boolean availabilityStatus){
        this.Id=id;
        this.Title=title;
        this.Author=author;
        this.Genre=genre;
        this.AvailabilityStatus=availabilityStatus;

    }
}
