package WorkshopWeek9;

public class PermanentEmployee extends Employee{
    
    double bonus;
    
    PermanentEmployee(int empID, String name, double basicSalary, double bonus){
        super(empID, name, basicSalary);
        this.bonus = bonus;
    }
    
    double calculateTotalSalary(){
        return basicSalary + bonus;
    }
    
    void displayEmployeeInfo(){
        super.displayEmployeeInfo();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}