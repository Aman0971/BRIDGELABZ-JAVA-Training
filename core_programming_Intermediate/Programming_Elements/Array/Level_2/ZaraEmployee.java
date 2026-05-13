import java.util.Scanner;

public class ZaraEmployee {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Arrays for storing employee data
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Variables for totals
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Taking input from user
        System.out.println("Enter details of 10 employees:");

        for (int i = 0; i < 10; i++) {

            System.out.println("\nEmployee " + (i + 1));

            // Input Salary
            System.out.print("Enter Salary: ");
            double sal = sc.nextDouble();

            // Input Years of Service
            System.out.print("Enter Years of Service: ");
            double years = sc.nextDouble();

            // Validation
            if (sal <= 0 || years < 0) {
                System.out.println("Invalid input! Please enter again.");
                i--; // decrement index to repeat input
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = years;
        }

        // Calculating bonus and new salary
        for (int i = 0; i < 10; i++) {

            // Bonus Calculation
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }

            // New Salary
            newSalary[i] = salary[i] + bonus[i];

            // Totals
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display Employee Details
        System.out.println("\n----- Employee Details -----");

        for (int i = 0; i < 10; i++) {

            System.out.println("\nEmployee " + (i + 1));
            System.out.println("Old Salary : " + salary[i]);
            System.out.println("Years of Service : " + yearsOfService[i]);
            System.out.println("Bonus : " + bonus[i]);
            System.out.println("New Salary : " + newSalary[i]);
        }

        // Display Totals
        System.out.println("\n----- Company Summary -----");

        System.out.println("Total Old Salary : " + totalOldSalary);
        System.out.println("Total Bonus Payout : " + totalBonus);
        System.out.println("Total New Salary : " + totalNewSalary);

        sc.close();
    }
}