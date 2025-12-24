package WorkshopWeek8;

public class Student{
    
    private int id;
    private String name;
    private String address;
    private long phoneNumber;
    private static String collegeName;
    
    public Student(int id, String name, String address, long phoneNumber, String collegeName){
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        Student.collegeName = collegeName;
    }
    
    void displayInfo(){
        System.out.println("\nStudent ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Address: " + address);
        System.out.println("Student phone number: " + phoneNumber);
        System.out.println("College Name: " + collegeName);
    }
}