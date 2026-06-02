import java.util.Scanner;

public class AgeHeight{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        int ageAmar = input.nextInt();
        double heightAmar = input.nextDouble();

        
        int ageAkbar = input.nextInt();
        double heightAkbar = input.nextDouble();

        
        int ageAnthony = input.nextInt();
        double heightAnthony = input.nextDouble();

        
        String youngest;
        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            youngest = "Amar";
        } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }
        System.out.println("The youngest friend is: " + youngest);

        
        String tallest;
        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
            tallest = "Amar";
        } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }
        System.out.println("The tallest friend is: " + tallest);
    }
}
