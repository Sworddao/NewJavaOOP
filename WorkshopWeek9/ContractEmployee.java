package WorkshopWeek9;

public class ContractEmployee extends Employee{
    
    int workingDays;
    
    ContractEmployee(int empID, String name, double basicSalary, int workingDays){
        super(empID, name, basicSalary);
        this.workingDays = workingDays;
    }
    
    double calculateTotalSalary(){
        return workingDays * basicSalary;
    }
    
    void displayEmployeeInfo(){
        super.displayEmployeeInfo();
        System.out.println("Working Days: " + workingDays);
        System.out.println("Total Salary: " + calculateTotalSalary());
    }

}