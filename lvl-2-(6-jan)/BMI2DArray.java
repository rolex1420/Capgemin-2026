import java.util.Scanner;

class BMI2DArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = input.nextInt();

        double[][] personData = new double[number][3];
        String[] status = new String[number];

        for (int i = 0; i < number; i++) {

            System.out.print("Enter weight: ");
            personData[i][0] = input.nextDouble();

            System.out.print("Enter height: ");
            personData[i][1] = input.nextDouble();

            personData[i][2] = personData[i][0] /
                               (personData[i][1] * personData[i][1]);

            if (personData[i][2] < 18.5) {
                status[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                status[i] = "Normal";
            } else {
                status[i] = "Overweight";
            }
        }

        for (int i = 0; i < number; i++) {
            System.out.println("BMI: " + personData[i][2] + " Status: " + status[i]);
        }

        
    }
}
