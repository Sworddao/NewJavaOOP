package WorkshopWeek10;

public class ScienceStudent extends Student{
    
    public ScienceStudent(int rollNo, String name, int marks){
        super(rollNo, name, marks);
    }
    
    public String calculateResult(){
        super.calculateResult();
        return (getMarks() >= 50) ? "Passed in Science" : "Failed";
    }
    
    public String calculateResult(int graceMarks){
        int totalMarks = getMarks() + graceMarks;
        if(totalMarks >= 50){
            System.out.println("Marks with grace: " + totalMarks);
        }
        return "Passed";
    }
}