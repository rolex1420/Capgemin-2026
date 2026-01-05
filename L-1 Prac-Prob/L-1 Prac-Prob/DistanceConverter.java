/* Create a program to convert distance in kilometers to miles. */
import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kmPerMile = 1.6;
        double distanceInKm = input.nextDouble();
        double totalMiles = distanceInKm / kmPerMile;
        System.out.println("The total miles is " + totalMiles + " mile for the given " + distanceInKm + " km");
        
    }
}
