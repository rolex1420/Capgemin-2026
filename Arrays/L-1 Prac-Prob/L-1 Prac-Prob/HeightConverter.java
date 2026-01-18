/*Write a program that takes your height in centimeters and converts it into feet and inches
 */
import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cmPerInch = 2.54;
        int inchesPerFoot = 12;
        double heightInCm = input.nextDouble();
        double totalInches = heightInCm / cmPerInch;
        int feet = (int) (totalInches / inchesPerFoot);
        double inches = totalInches % inchesPerFoot;
        System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + feet + " and inches is " + inches);
    }
}
