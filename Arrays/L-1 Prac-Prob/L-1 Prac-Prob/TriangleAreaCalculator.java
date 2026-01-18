import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cmPerInch = 2.54;
        double sqCmPerSqInch = cmPerInch * cmPerInch; 
        double baseInInches = input.nextDouble();
        double heightInInches = input.nextDouble();
        double areaSqInches = 0.5 * baseInInches * heightInInches;
        double areaSqCm = areaSqInches * sqCmPerSqInch; 
        System.out.println("The Area of the Triangle in square inches is " + areaSqInches + " and in square centimeters is " + areaSqCm);
    }
}