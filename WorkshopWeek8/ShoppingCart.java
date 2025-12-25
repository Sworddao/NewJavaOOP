package WorkshopWeek8;

public class ShoppingCart{
    
    private String itemName;
    private double itemPrice;
    private int quantity;
    
    public ShoppingCart(String itemName, double itemPrice, int quantity){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }
    
    public int getQuantity(){
        return this.quantity = quantity;
    }
    
    public void setQuantity(int quantity){
        if(quantity > 0){
            this.quantity = quantity;
        }else{
            System.out.println("Invalid Quantity");
        }
    }
    
    public double calculateTotal(){
        return itemPrice * quantity;
    }
    
    public double calculateDiscoutnedTotal(double discountPercent){
        return calculateTotal() - (calculateTotal() * discountPercent / 100);
    }
    
    public void displayCart(){
        System.out.println("\nItem Name: " + itemName);
        System.out.println("Item Price: " + itemPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + calculateTotal());
        System.out.println("Discounted total price: " + calculateDiscoutnedTotal(10));
    }
}