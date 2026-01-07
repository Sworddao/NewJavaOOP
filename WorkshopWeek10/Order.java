package WorkshopWeek10;

public class Order{
    
    private int orderID;
    private String customerName;
    private double amount;
    
    public Order(int orderID, String customerName, double amount){
        this.orderID = orderID;
        this.customerName = customerName;
        this.amount = amount;
    }
    
    public int getOrderID(){
        return this.orderID;
    }
    
    public String getCustomerName(){
        return this.customerName;
    }
    
    public double getAmount(){
        return this.amount;
    }
    
    public void setOrderID(int newOrderID){
        this.orderID = newOrderID;
    }
    
    public void setCustomerName(String newCustomerName){
        this.customerName = newCustomerName;
    }
    
    public void setAmount(double newAmount){
        this.amount = newAmount;
    }
    
    public double calculateFinalAmount(){
        return this.amount;
    }
    
    public String toString(){
        return "Order ID: " + this.orderID + "\nCustomer Name: " + this.customerName + "\nAmount: " + this.amount;
    }
}