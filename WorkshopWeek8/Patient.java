package WorkshopWeek8;

public class Patient{
    
    private String patientName;
    private int age;
    private int daysAdmitted;
    private double dailyCharge;
    
    public Patient(String patientName, int age, int daysAdmitted, double dailyCharge){
        this.patientName = patientName;
        this.age = age;
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }
    
    public int getDaysAdmitted(){
        return this.daysAdmitted = daysAdmitted;
    }
    
    public void setDaysAdmitted(int daysAdmitted){
        if(daysAdmitted > 0){
            this.daysAdmitted = daysAdmitted;
        }else{
            System.out.println("Invalid Days");
        }
    }
    
    public double calculateTotalBill(){
        double bill = daysAdmitted * dailyCharge;
        if(daysAdmitted > 7 ){
            bill = bill - (bill * 10 / 100);
            System.out.println("Total with discount: " + bill);
        }else{
            System.out.println("Total: " + bill);
        }
        return bill;
    }
    
    public void displayPatientDetails(){
        System.out.println("\nPatient Name: " + patientName);
        System.out.println("Patient Age: " + age);
        System.out.println("Days admitted: " + daysAdmitted);
        System.out.println("Daily Charge: " + dailyCharge);
    }
}