package WorkshopWeek8;

public class ShoppingApp{
    public static void main(String[] args){
        
        ShoppingCart cart = new ShoppingCart("Laptop", 234067, 2);
        
        //intial cart
        cart.displayCart();
        
        //changed quantity cart
        cart.setQuantity(3);
        cart.displayCart();
    }
}