package WorkshopWeek10;

public class Student{
    
    private int rollNo;
    private String name;
    private int marks;
    
    public Student(int rollNo, String name, int marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    
    public int getRollNo(){
        return this.rollNo;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getMarks(){
        return this.marks;
    }
    
    public void setRollNo(int newRollNo){
        this.rollNo = newRollNo;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public void setMarks(int newMarks){
        this.marks = newMarks;
    }
    
    public String calculateResult(){
        return (marks >= 40) ? "Pass" : "Fail";
    }
    
    public String toString(){
        return "Student roll no: " + this.rollNo + "\nName: " + this.name + "\nMarks: " + this.marks;
    }
}