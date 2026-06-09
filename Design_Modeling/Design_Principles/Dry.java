package Design_Principles;

public class Dry{
  //apply dry.
    public double calculatePercentage(int marks) {
        return (marks / 100.0) * 100;
    }
    public void marks1(){
        int marks1 = 80;
         System.out.print("Marks1 percentage: ");
        double percentage1 = calculatePercentage(marks1);
        System.out.println(percentage1);
    }
    public void marks2(){
        int marks2 = 90;
        System.out.print("Marks2 percentage: ");
        double percentage2 = calculatePercentage(marks2);
        System.out.println(percentage2);
    }

    public static void main(String[] args) {
      //Without dry principle.

        // int marks1 = 80;
        // double percentage1 = (marks1 / 100.0) * 100;
        // System.out.println(percentage1);

        // int marks2 = 90;
        // double percentage2 = (marks2 / 100.0) * 100;
        // System.out.println(percentage2);

    // with dry principle
     Dry dry = new Dry();
      dry.marks1();
      dry.marks2();
        
    }
} 

// there is a way where you can make dry method static ,

    //  class Dry{
    //  static double calculatePercentage(int marks) {
    //         return (marks / 100.0) * 100;
    //     }
    
    //     public static void main(String[] args) {
    
    //         System.out.println(calculatePercentage(80));
    //         System.out.println(calculatePercentage(90));
    //         System.out.println(calculatePercentage(70));
    //     }
    //  }       