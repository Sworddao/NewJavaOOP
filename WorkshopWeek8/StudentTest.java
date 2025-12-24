package WorkshopWeek8;

public class StudentTest{
    public static void main(String[] args){
        
        Student s1 = new Student(1, "Sai", "Bouddha", 12345678910L, "Islington College");
        Student s2 = new Student(2, "Ing", "Lalitpur", 234567891011L, "Islington College");         
        
        s1.displayInfo();
        s2.displayInfo();
    }
}