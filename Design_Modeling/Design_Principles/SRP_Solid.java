package Design_Principles;


//public class SRP_Solid {
    //--> Violates Single Responsibility Principle 
    // --> There is multiple responsibility in single class , which is not good according SOLID.

    // public void calculateSalary() {
    //     System.out.println("Calculating Salary");
    // }

    // public void saveToDatabase() {
    //     System.out.println("Saving Employee");
    // }

    // public void generateReport() {
    //     System.out.println("Generating Report");
    // }

    // public static void main(String[] args) {
    //     SRP_Solid emp = new SRP_Solid();

    //     emp.calculateSalary();
    //     emp.saveToDatabase();
    //     emp.generateReport();
    // }

    //with SRP.
class Employee{
    private String name;
    private int salary;

    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
}
    class Salary{
        public void calculateSalary(Employee emp) {
            System.out.println("Calculating Salary: "+emp.getSalary());
        }
    }
    class Database{
        public void saveToDatabase(Employee emp) {
            System.out.println("Saving Employee: "+emp.getName());
        }
    }
    class Report{
        public void generateReport(Employee emp) {
            System.out.println("Generating Report for: "+emp.getName());
        }
    }
    public class SRP_Solid {
    public static void main(String[] args){

        Employee emp = new Employee("Aman", 50000);

        Salary salary = new Salary();
        Database database = new Database();
        Report report = new Report();

        salary.calculateSalary(emp);
        database.saveToDatabase(emp);
        report.generateReport(emp);
    }
}

