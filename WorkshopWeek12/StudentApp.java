package WorkshopWeek12;
import java.util.*;

public class StudentApp{
    public static void main(String[] args){

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ayush", 9876543210L, "L1N1"));
        students.add(new Student("Rahul", 9876543211L, "L1M1"));
        students.add(new Student("Gaurav", 9876543212L, "L1N2"));

        /*for(Student x : students){
            x.displayStudentDetails();
        }*/

        students.remove(2);

        students.add(0, new Student("Aavaya", 9876543213L, "L1C1"));

        students.get(2).setGroup("L1N2");      

        students.get(1).setName("Aayush");

        for(Student z : students){
            z.displayStudentDetails();
        }
    }    
}