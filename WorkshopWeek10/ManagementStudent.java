package WorkshopWeek10;

public class ManagementStudent extends Student{
    
    public ManagementStudent(int rollNo, String name, int marks){
        super(rollNo, name, marks);
    }
    
    @Override
    public String calculateResult(){
        super.calculateResult();
        return (getMarks() >= 35) ? "Passed" : "Failed";
    }
    
    public String calculateResult(int graceMarks){
        int totalMarks = getMarks() + graceMarks;
        if(totalMarks >= 35){
            System.out.println("Marks with grace: " + totalMarks);
        }
        return "Passed";
    }
}