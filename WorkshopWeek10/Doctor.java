package WorkshopWeek10;

public class Doctor extends Person{
    
    public String specialization;
    public double consultationFee;
    
    public Doctor(int id, String name, String specialization, double consultationFee){
        super(id, name);
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    } 
    
    public String getSpecialization(){
        return this.specialization;
    }
    
    public double getConsultationFee(){
        return this.consultationFee;
    }
    
    public void setSpecialization(String newSpecialization){
        this.specialization = newSpecialization;
    }
    
    public void setConsultationFee(double newConsultationFee){
        this.consultationFee = newConsultationFee;
    }
    
    public double calculateSalary(){
        return consultationFee * 15;
    }
    
    public double calculateSalary(int emergencyCases){
        return calculateSalary() + (emergencyCases * 100);
    }
    
    public String toString(){
        return super.toString() + "\nSpecialization: " + this.specialization + "\nConsultation Fee: " + this.consultationFee + "\nSalary: " + calculateSalary();
    }
    
}