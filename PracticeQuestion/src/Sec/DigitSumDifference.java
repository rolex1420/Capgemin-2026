package Sec;

public class DigitSumDifference {
    private static int digitSum(int n) {
        int sum = 0;
        while (n > 0) { sum += n % 10; n /= 10; }
        return sum;
    }

    public static int digitSumDifference(int m, int n) {
        int sumDiv4 = 0, sumDiv7 = 0;
        for (int i = m; i <= n; i++) {
            if (i % 4 == 0) sumDiv4 += digitSum(i);
            if (i % 7 == 0) sumDiv7 += digitSum(i);
        }
        return Math.abs(sumDiv4 - sumDiv7);
    }

    public static void main(String[] args) {
        System.out.println(digitSumDifference(50, 120)); // 2
    }
}