import java.util.Scanner;

class DigitFrequency {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] frequency = new int[10];

        while (number != 0) {
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }

        for (int i = 0; i < frequency.length; i++) {
            System.out.println("Digit " + i + " Frequency: " + frequency[i]);
        }

        
    }
}
