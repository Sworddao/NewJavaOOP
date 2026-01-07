package WorkshopWeek10;

public class HospitalApp{
    public static void main(String[] args){
        
        Doctor doctor = new Doctor(404, "Sai", "Neurology", 4000);
        Nurse nurse = new Nurse(101, "Ing", "Night", 2000);
        
        System.out.println("----Doctor----");
        System.out.println(doctor);
        System.out.println("Salary with 3 emergency cases: " + doctor.calculateSalary(3));
        System.out.println();
        System.out.println("----Nurse----");
        System.out.println(nurse);
    }
}