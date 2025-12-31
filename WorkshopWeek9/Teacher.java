package WorkshopWeek9;

public class Teacher extends Person{
    
    String subject;
    double bonus;
    
    Teacher(int id, String name, double basicSalary, String subject, double bonus){
        super(id, name, basicSalary);
        this.subject = subject;
        this.bonus = bonus;
    }
    
    double calculateAnnualSalary(){
        return super.calculateAnnualSalary() + bonus;
    }
    
    void displayInfo(){
        super.displayInfo();
        System.out.println("Subject name: " + subject);
        System.out.println("Bonus:" + bonus);
        System.out.println("Annual Salary: " + calculateAnnualSalary());
    }
}