import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weightInPounds = input.nextDouble();
        double poundToKgConversionFactor = 2.2;
        double weightInKg = weightInPounds / poundToKgConversionFactor;
        System.out.println("The weight of the person in pound is " + weightInPounds + " and in kg is " + weightInKg);
    }
}
