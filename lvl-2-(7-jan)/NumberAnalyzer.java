import java.util.Scanner;

class NumberAnalyzer {

    public boolean isPositive(int number) {
        return number >= 0;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int compare(int number1, int number2) {
        if (number1 > number2) return 1;
        if (number1 < number2) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberAnalyzer analyzer = new NumberAnalyzer();
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            
            if (analyzer.isPositive(numbers[i])) {
                if (analyzer.isEven(numbers[i])) {
                    System.out.println(numbers[i] + " is Positive and Even");
                } else {
                    System.out.println(numbers[i] + " is Positive and Odd");
                }
            } else {
                System.out.println(numbers[i] + " is Negative");
            }
        }

        int comparisonResult = analyzer.compare(numbers[0], numbers[4]);
        if (comparisonResult == 1) {
            System.out.println("First element is Greater than Last element");
        } else if (comparisonResult == -1) {
            System.out.println("First element is Less than Last element");
        } else {
            System.out.println("First element is Equal to Last element");
        }
    }
}