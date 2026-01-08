package WorkshopWeek10;

public class NormalOrder extends Order{
    
    public NormalOrder(int orderID, String customerName, double amount){
        super(orderID, customerName, amount);
    }
    
    @Override
    public double calculateFinalAmount(){
        super.calculateFinalAmount();
        return getAmount();
    }
    
    public double calculateFinalAmount(double discountAmount){
        return calculateFinalAmount() - discountAmount;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nFinal Amount: " + calculateFinalAmount();
    }
}