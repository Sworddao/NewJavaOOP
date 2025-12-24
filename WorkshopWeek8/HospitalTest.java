package WorkshopWeek8;

public class HospitalTest{
    public static void main(String[] args){
        
        Patient patient1 = new Patient("Sai", 18, 4, 140);
        Patient patient2 = new Patient("Ing", 18, 8, 170);
        Patient patient3 = new Patient("Vector", 19, 9, 190);
        
        patient1.displayPatientDetails();
        patient1.calculateTotalBill();
        
        patient2.displayPatientDetails();
        patient2.calculateTotalBill();
        
        patient3.displayPatientDetails();
        patient3.calculateTotalBill();
    }
}