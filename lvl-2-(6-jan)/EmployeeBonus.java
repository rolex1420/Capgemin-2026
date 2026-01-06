import java.util.Scanner;

class EmployeeBonus {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        final int EMPLOYEE_COUNT = 10;

        double[] salary = new double[EMPLOYEE_COUNT];
        double[] yearsOfService = new double[EMPLOYEE_COUNT];
        double[] bonus = new double[EMPLOYEE_COUNT];
        double[] newSalary = new double[EMPLOYEE_COUNT];


        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;


        for (int index = 0; index < EMPLOYEE_COUNT; index++) {

            System.out.print("Enter salary for employee " + (index + 1) + ": ");
            salary[index] = input.nextDouble();

            System.out.print("Enter years of service: ");
            yearsOfService[index] = input.nextDouble();


            if (salary[index] <= 0 || yearsOfService[index] < 0) {
                System.out.println("Invalid input. Enter again.");
                index--;
            }
        }

 
        for (int index = 0; index < EMPLOYEE_COUNT; index++) {

            if (yearsOfService[index] > 5) {
                bonus[index] = salary[index] * 0.05;
            } else {
                bonus[index] = salary[index] * 0.02;
            }

            newSalary[index] = salary[index] + bonus[index];

            totalBonus += bonus[index];
            totalOldSalary += salary[index];
            totalNewSalary += newSalary[index];
        }


        System.out.println("Total Bonus Paid: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        
    }
}
