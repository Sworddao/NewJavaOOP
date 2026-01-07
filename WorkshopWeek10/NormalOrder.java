package WorkshopWeek10;

public class NormalOrder extends Order{
    
    public NormalOrder(int orderID, String customerName, double amount){
        super(orderID, customerName, amount);
    }
    
    public double calculateFinalAmount(){
        super.calculateFinalAmount();
        return getAmount();
    }
    
    public double calculateFinalAmount(double discountAmount){
        return calculateFinalAmount() - discountAmount;
    }
    
    public String toString(){
        return super.toString() + "\nFinal Amount: " + calculateFinalAmount();
    }
}