package WorkshopWeek9;

public class SchoolApp{
    public static void main(String[] args){
        
        Person.collegeName = "Islington";
        
        Teacher t1 = new Teacher(1, "Sai", 24000, "Programming", 2000);
        Staff s1 = new Staff(2, "Ing", 22000, 6, 140);
        
        System.out.println("Teacher Details:");
        t1.displayInfo();
        System.out.println("\nStaff Details:");
        s1.displayInfo();
    }
}