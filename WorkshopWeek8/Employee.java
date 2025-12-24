package WorkshopWeek8;

public class Employee{
    
    private double basicSalary;
    
    public Employee(double basicSalary){
        this.basicSalary = basicSalary;
    }
    
    public double calculateGrossSalary(){
        return basicSalary + (0.20 * basicSalary);
    }
    
    public double getBasicSalary(){
        return basicSalary;
    }
    
    public void displaySalary(){
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Gross Salary: " + calculateGrossSalary());
    }
}