package WorkshopWeek9;

public class Staff extends Person{
    
    int workingHours;
    double ratePerHour;
    
    Staff(int id, String name, double basicSalary, int workingHours, double ratePerHour){
        super(id, name, basicSalary);
        this.workingHours = workingHours;
        this.ratePerHour = ratePerHour;
    }
    
    double calculateSalary(){
        return workingHours * ratePerHour;
    }
    
    void displayInfo(){
        super.displayInfo();
        System.out.println("Working Hours:" + workingHours);
        System.out.println("Rate per hour:" + ratePerHour);
        System.out.println("Salary per Day: " + calculateSalary());
    }
}