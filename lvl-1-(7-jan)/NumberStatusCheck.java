import java.util.Scanner;

class NumberStatusCheck {

    public int checkNumberStatus(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberStatusCheck statusCheck = new NumberStatusCheck();

        int number = scanner.nextInt();
        int status = statusCheck.checkNumberStatus(number);

        System.out.println("Status code: " + status);
    }
}