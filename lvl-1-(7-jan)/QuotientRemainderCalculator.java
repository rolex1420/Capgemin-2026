import java.util.Scanner;

class QuotientRemainderCalculator {

    public int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuotientRemainderCalculator calculator = new QuotientRemainderCalculator();

        int number = scanner.nextInt();
        int divisor = scanner.nextInt();

        int[] results = calculator.findRemainderAndQuotient(number, divisor);

        System.out.println("Quotient: " + results[0]);
        System.out.println("Remainder: " + results[1]);
    }
}