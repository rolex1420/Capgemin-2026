/*Write a new program similar to the program # 6 but take user input for Student Fee and University Discount */
import java.util.Scanner;

public class UniversityFeeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double studentFee = input.nextDouble();
        double discountPercent = input.nextDouble();
        double discountAmount = studentFee * (discountPercent / 100.0);
        double finalDiscountedFee = studentFee - discountAmount;
        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalDiscountedFee);
    }
}