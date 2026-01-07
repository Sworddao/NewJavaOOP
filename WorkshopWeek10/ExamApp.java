package WorkshopWeek10;

public class ExamApp{
    public static void main(String[] args){
        
        ScienceStudent science = new ScienceStudent(4, "Sai", 94);
        ManagementStudent management = new ManagementStudent(7, "Ing", 92);
        
        System.out.println("----Science-----");
        System.out.println(science);
        System.out.println("Result with grace: " + science.calculateResult(3));
        System.out.println();
        System.out.println("----Management----");
        System.out.println(management);
        System.out.println("Result with grace: " + management.calculateResult(5));
    }
}