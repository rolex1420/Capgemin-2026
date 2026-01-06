import java.util.Scanner;

class ReverseNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int temp = number;
        int count = 0;

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        int[] reverse = new int[count];

        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        for (int i = 0; i < count; i++) {
            reverse[i] = digits[count - i - 1];
        }

        for (int value : reverse) {
            System.out.print(value);
        }

      
    }
}
