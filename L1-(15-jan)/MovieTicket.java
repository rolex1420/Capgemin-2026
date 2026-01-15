class MovieTicket {
    private String movieName;
    private int seatNumber;
    private double price;

    public MovieTicket(String movieName, double price) {
        this.movieName = movieName;
        this.price = price;
    }

    public void bookTicket(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void displayDetails() {
        System.out.println(movieName);
        System.out.println(seatNumber);
        System.out.println(price);
    }
}

public class Main {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Inception", 250);
        ticket.bookTicket(15);
        ticket.displayDetails();
    }
}
