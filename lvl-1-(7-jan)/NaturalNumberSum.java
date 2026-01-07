import java.util.Scanner;

class NaturalNumberSum {

    public int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NaturalNumberSum calculator = new NaturalNumberSum();

        int n = scanner.nextInt();
        int sum = calculator.calculateSum(n);

        System.out.println("Sum of " + n + " natural numbers is: " + sum);
    }
}
