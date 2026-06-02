import java.util.Scanner;

public class ZaraEmployee {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

       
        System.out.println("Enter details of 10 employees:");

        for (int i = 0; i < 10; i++) {

            System.out.println("\nEmployee " + (i + 1));

            
            System.out.print("Enter Salary: ");
            double sal = sc.nextDouble();

            
            System.out.print("Enter Years of Service: ");
            double years = sc.nextDouble();

            
            if (sal <= 0 || years < 0) {
                System.out.println("Invalid input! Please enter again.");
                i--; 
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = years;
        }

        
        for (int i = 0; i < 10; i++) {

            
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; 
            } else {
                bonus[i] = salary[i] * 0.02; 
            }

            
            newSalary[i] = salary[i] + bonus[i];

            
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        
        System.out.println("\n----- Employee Details -----");

        for (int i = 0; i < 10; i++) {

            System.out.println("\nEmployee " + (i + 1));
            System.out.println("Old Salary : " + salary[i]);
            System.out.println("Years of Service : " + yearsOfService[i]);
            System.out.println("Bonus : " + bonus[i]);
            System.out.println("New Salary : " + newSalary[i]);
        }

        
        System.out.println("\n----- Company Summary -----");

        System.out.println("Total Old Salary : " + totalOldSalary);
        System.out.println("Total Bonus Payout : " + totalBonus);
        System.out.println("Total New Salary : " + totalNewSalary);

       
    }
}