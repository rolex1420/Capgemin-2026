package Sec;

public class NumberOfCarries {
    public static int numberOfCarries(int num1, int num2) {
        int carries = 0, carry = 0;
        while (num1 > 0 || num2 > 0) {
            int d1 = num1 % 10;
            int d2 = num2 % 10;
            int sum = d1 + d2 + carry;
            carry = sum / 10;
            if (carry > 0) carries++;
            num1 /= 10;
            num2 /= 10;
        }
        return carries;
    }

    public static void main(String[] args) {
        System.out.println(numberOfCarries(451, 349)); // 2
    }
}