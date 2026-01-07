import java.util.Scanner;

class MinMaxFinder {

    public int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = number1;
        int largest = number1;

        if (number2 < smallest) smallest = number2;
        if (number3 < smallest) smallest = number3;

        if (number2 > largest) largest = number2;
        if (number3 > largest) largest = number3;

        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MinMaxFinder finder = new MinMaxFinder();

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int[] results = finder.findSmallestAndLargest(num1, num2, num3);

        System.out.println("Smallest: " + results[0]);
        System.out.println("Largest: " + results[1]);
    }
}