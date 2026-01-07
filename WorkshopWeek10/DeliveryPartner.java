package WorkshopWeek10;

public class DeliveryPartner{
    
    private int partnerID;
    private String name;
    private double basePay;
    
    public DeliveryPartner(int partnerID, String name, double basePay){
        this.partnerID = partnerID;
        this.name = name;
        this.basePay = basePay;
    }
    
    public int getPartnerID(){
        return this.partnerID;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getBasePay(){
        return this.basePay;
    }
    
    public void setPartnerID(int newPartnerID){
        this.partnerID = newPartnerID;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public void setBasePay(double newBasePay){
        this.basePay = newBasePay;
    }
    
    public String toString(){
        return "Partner ID: " + this.partnerID + "\nName: " + this.name + "\nBase Pay: " + this.basePay;
    }
    
    public double calculatePayment(){
        return this.basePay;
    }
}