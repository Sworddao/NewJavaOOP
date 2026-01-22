package WorkshopWeek12;
import java.util.*;

public class StudentApp {

    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        addData();
        removeData();
        updateData();
        displayData();
    }

    public static void addData() {
        students.add(new Student("Ayush", 9876543210L, "L1N1"));
        students.add(new Student("Rahul", 9876543211L, "L1M1"));
        students.add(new Student("Gaurav", 9876543212L, "L1N2"));
        students.add(0, new Student("Aavaya", 9876543213L, "L1C1"));
    }

    public static void removeData() {
        String removeName = "Gaurav";

        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (s.getName().equals(removeName)) {
                it.remove();
                break;
            }
        }
    }

    public static void updateData() {

        for (Student s : students) {
            if (s.getName().equals("Rahul")) {
                s.setGroup("L1N2");
                break;
            }
        }

        for (Student s : students) {
            if (s.getName().equals("Ayush")) {
                s.setName("Aayush");
                break;
            }
        }
    }

    public static void displayData() {
        for (Student s : students) {
            s.displayStudentDetails();
        }
    }
}
