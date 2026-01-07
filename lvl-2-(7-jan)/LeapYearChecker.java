import java.util.Scanner;

class LeapYearChecker {

    public boolean isLeapYear(int year) {
        if (year < 1582) {
            return false;
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LeapYearChecker checker = new LeapYearChecker();

        int year = scanner.nextInt();
        boolean isLeap = checker.isLeapYear(year);

        if (year < 1582) {
             System.out.println("Year must be >= 1582");
        } else if (isLeap) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}