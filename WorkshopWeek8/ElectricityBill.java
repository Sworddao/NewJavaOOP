package WorkshopWeek8;

public class ElectricityBill{
    
    private String consumerName;
    private int unitsConsumed;
    
    public ElectricityBill(String consumerName, int unitsConsumed){
        this.consumerName = consumerName;
        this.unitsConsumed = unitsConsumed;
    }
    
    public double getUnitsConsumed(){
        return this.unitsConsumed = unitsConsumed;
    }
    
    public String getConsumerName(){
        return this.consumerName = consumerName;
    }
    
    public void setUnitsConsumed(int unitsConsumed){
        if(unitsConsumed > 0){
            this.unitsConsumed = unitsConsumed;
        }else{
            System.out.println("Invalid units entered");
        }
    }
    
    public double calculateBill(){
        double bill = 0;
        if(unitsConsumed <= 100){
            bill = unitsConsumed * 5;
        }else{
            bill = 100 * 5 + (unitsConsumed - 100) * 8;
        }
        return bill;
    }
    
    public void displayBill(){
        System.out.println("Consumer Name: " + getConsumerName());
        System.out.println("Units Consumed: " + getUnitsConsumed());
        System.out.println("Bill Amount: ₹" + calculateBill());
    }
}