package WorkshopWeek10;

public class PremiumOrder extends Order{
    
    public PremiumOrder(int orderID, String customerName, double amount){
        super(orderID, customerName, amount);
    }
    
    @Override
    public double calculateFinalAmount(){
        super.calculateFinalAmount();
        return getAmount() + 70; // premium charges..
    }
    
    public double calculateFinalAmount(double discountAmount){
        return calculateFinalAmount() - discountAmount;
    }
    
    public String toString(){
        return super.toString() + "\nFinal Amount: " + calculateFinalAmount();
    }
}