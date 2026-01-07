import java.util.Scanner;

class NaturalNumberSumChecker {

    public int calculateSumRecursion(int n) {
        if (n <= 1) {
            return n;
        }
        return n + calculateSumRecursion(n - 1);
    }

    public int calculateSumFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NaturalNumberSumChecker checker = new NaturalNumberSumChecker();

        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Not a natural number");
            return;
        }

        int sumRecursive = checker.calculateSumRecursion(n);
        int sumFormula = checker.calculateSumFormula(n);

        System.out.println("Sum via Recursion: " + sumRecursive);
        System.out.println("Sum via Formula: " + sumFormula);

        if (sumRecursive == sumFormula) {
            System.out.println("Both computations are correct.");
        } else {
            System.out.println("Computation mismatch.");
        }
    }
}