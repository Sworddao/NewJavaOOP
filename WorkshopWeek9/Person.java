package WorkshopWeek9;

public class Person{
    
    int id;
    double basicSalary;
    String name;
    static String collegeName;
    
    Person(int id, String name, double basicSalary){
        this.id = id;
        this.name = name;   
        this.basicSalary = basicSalary;
    }
    
    double calculateAnnualSalary(){
        return basicSalary * 12;
    }
    
    void displayInfo(){
        System.out.println("Person ID:" + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("College Name: " + collegeName);
    }
}

