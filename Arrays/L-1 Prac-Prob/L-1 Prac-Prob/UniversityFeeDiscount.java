/*  The University is charging the student a fee of INR 125000 for the course. The University is willing to offer a discount of 10%.
 Write a program to find the discounted amount and discounted price the student will pay for the course. */
public class UniversityFeeDiscount {
    public static void main(String[] args) {
        double courseFee = 125000;
        double discountPercent = 10;
        double discountAmount = courseFee * (discountPercent / 100.0);
        double finalDiscountedFee = courseFee - discountAmount;
        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalDiscountedFee);
    }
}
