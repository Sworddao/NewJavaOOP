package WorkshopWeek10;

public class CarDelivery extends DeliveryPartner{
    
     public CarDelivery(int partnerID, String name, double basePay){
        super(partnerID, name, basePay);
    }
    
    @Override
    public double calculatePayment(){
        return super.calculatePayment() + 1000;
    }
    
    public double calculatePayment(int extraOrders){
        return calculatePayment() + (extraOrders * 100);
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nPayment: " + calculatePayment(); 
    }
}