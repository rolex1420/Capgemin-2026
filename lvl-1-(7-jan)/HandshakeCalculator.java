import java.util.Scanner;

class HandshakeCalculator {

    public int calculateMaxHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HandshakeCalculator calculator = new HandshakeCalculator();

        int numberOfStudents = scanner.nextInt();

        int handshakes = calculator.calculateMaxHandshakes(numberOfStudents);

        System.out.println("Maximum number of handshakes: " + handshakes);
    }
}