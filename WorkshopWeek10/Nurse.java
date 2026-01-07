package WorkshopWeek10;

public class Nurse extends Person{
    
    public String shift;
    public double extraAllowance;
    
    public Nurse(int id, String name, String shift, double extraAllowance){
        super(id, name);
        this.shift = shift;
        this.extraAllowance = extraAllowance;
    }
    
    public String getShift(){
        return this.shift;
    }
    
    public void setShift(String newShift){
        this.shift = newShift;
    }
    
    public double getExtraAllowance(){
        return this.extraAllowance;
    }
    
    public void setExtraAllowance(double newExtraAllowance){
        this.extraAllowance = newExtraAllowance;
    }
    
    public double calculateSalary(){
        double baseSalary = 30000;
        return baseSalary + this.extraAllowance;
    }
    
    public String toString(){
        return super.toString() + "\nShift: " + shift + "\nExtra Allowance: " + extraAllowance + "\nSalary: " + calculateSalary();
    }
}