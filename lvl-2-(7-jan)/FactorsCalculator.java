import java.util.Scanner;

class FactorsCalculator {

    public int[] getFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public int sumFactors(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }
        return sum;
    }

    public long productFactors(int[] factors) {
        long product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }
        return product;
    }

    public double sumSquareFactors(int[] factors) {
        double sumSquare = 0;
        for (int i = 0; i < factors.length; i++) {
            sumSquare += Math.pow(factors[i], 2);
        }
        return sumSquare;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FactorsCalculator calculator = new FactorsCalculator();

        int number = scanner.nextInt();

        int[] factors = calculator.getFactors(number);
        
        System.out.print("Factors: ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }

        int sum = calculator.sumFactors(factors);
        long product = calculator.productFactors(factors);
        double sumSquare = calculator.sumSquareFactors(factors);

        System.out.println("\nSum of factors: " + sum);
        System.out.println("Sum of squares: " + sumSquare);
        System.out.println("Product of factors: " + product);
    }
}