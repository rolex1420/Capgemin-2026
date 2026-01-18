import java.util.Scanner;

public class DistanceConverter2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double feetPerYard = 3;
        double yardsPerMile = 1760;
        double distanceInFeet = input.nextDouble();
        double distanceInYards = distanceInFeet / feetPerYard;        
        double distanceInMiles = distanceInYards / yardsPerMile;
        System.out.println("The distance in yards is " + distanceInYards + " and in miles is " + distanceInMiles);
    }
}
