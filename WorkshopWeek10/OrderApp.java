package WorkshopWeek10;

public class OrderApp{
    public static void main(String[] args){
        
        NormalOrder normal = new NormalOrder(1, "Sai", 220);
        PremiumOrder premium = new PremiumOrder(2, "Ing", 420);
        
        System.out.println("----Normal Order----");
        System.out.println(normal);
        System.out.println("With Discount: " + normal.calculateFinalAmount(20));
        System.out.println();
        System.out.println("----Premium Order----");
        System.out.println(premium);
        System.out.println("With Discount: " + premium.calculateFinalAmount(25));
    }
}