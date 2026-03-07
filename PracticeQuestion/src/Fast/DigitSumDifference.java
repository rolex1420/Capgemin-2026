package Fast;

public class DigitSumDifference {

    private static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static int digitSumDifference(int m, int n) {
        int sumDivBy4 = 0;
        int sumDivBy7 = 0;

        for (int i = m; i <= n; i++) {
            if (i % 4 == 0) sumDivBy4 += digitSum(i);
            if (i % 7 == 0) sumDivBy7 += digitSum(i);
        }

        return Math.abs(sumDivBy4 - sumDivBy7);
    }

    public static void main(String[] args) {
        int m = 50, n = 120;
        System.out.println("Input : m = " + m + ", n = " + n);
        System.out.println("Output: " + digitSumDifference(m, n)); // Expected: 2
    }
}
