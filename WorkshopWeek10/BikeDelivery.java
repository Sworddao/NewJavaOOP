package WorkshopWeek10;

public class BikeDelivery extends DeliveryPartner{
    
    
    public BikeDelivery(int partnerID, String name, double basePay){
        super(partnerID, name, basePay);
    }
    
    public double calculatePayment(){
        return super.calculatePayment() + 500;
    }
    
    public double calculatePayment(int extraOrders){
        return calculatePayment() + (extraOrders * 50);
    }
    
    public String toString(){
        return super.toString() + "\nPayment: " + calculatePayment(); 
    }
}