package WorkshopWeek12;
import java.util.*;

public class StudentApp{

    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args){
        addData();
        removeData();
        getSetData();
        displayData();
    }

    public static void addData(){
        students.add(new Student("Ayush", 9876543210L, "L1N1"));
        students.add(new Student("Rahul", 9876543211L, "L1M1"));
        students.add(new Student("Gaurav", 9876543212L, "L1N2"));
        students.add(0, new Student("Aavaya", 9876543213L, "L1C1"));
    }

    public static void removeData(){
        students.remove(2);
    }

    public static void getSetData(){
        students.get(2).setGroup("L1N2");      
        students.get(1).setName("Aayush"); 
    }

    public static void displayData(){
        for(Student z : students){
            z.displayStudentDetails();
        }
    }    
}