package WorkshopWeek10;

public class DeliveryApp{
    public static void main(String[] args){
        
        BikeDelivery bike = new BikeDelivery(104, "Vector", 400);
        CarDelivery car = new CarDelivery(202, "Safal", 600);
        
        System.out.println("----From Bike----");
        System.out.println(bike);
        System.out.println("Grand Total with Extra Order: " + bike.calculatePayment(4)); // with 4 extra orders
        System.out.println("----From Car----");
        System.out.println(car);
        System.out.println("Grand Total with Additional Order: " + car.calculatePayment(2)); // with 2 extra orders
    }
}