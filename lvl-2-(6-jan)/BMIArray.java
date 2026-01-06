import java.util.Scanner;

class BMIArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = input.nextInt();

        double[] weight = new double[number];
        double[] height = new double[number];
        double[] bmi = new double[number];
        String[] status = new String[number];

        for (int i = 0; i < number; i++) {

            System.out.print("Enter weight: ");
            weight[i] = input.nextDouble();

            System.out.print("Enter height (meters): ");
            height[i] = input.nextDouble();

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal";
            } else {
                status[i] = "Overweight";
            }
        }

        for (int i = 0; i < number; i++) {
            System.out.println("BMI: " + bmi[i] + " Status: " + status[i]);
        }

      
    }
}
