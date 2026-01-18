import java.util.Scanner;
class DisplayRemQuot {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dividend (numerator): ");
        int dividend = scanner.nextInt();
        System.out.print("Enter the divisor (denominator): ");
        int divisor = scanner.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("The Quotient is: " + quotient+", and the Remainder is: " + remainder +" of two numbers "+ dividend +" and "+ divisor);

    }
}