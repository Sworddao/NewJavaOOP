package WorkshopWeek9;

public class VehicleApp{
    public static void main(String[] args){
        
        Car c1 = new Car(1, "BYD", 1234567, 4, "Electric");
        Bike b1 = new Bike(1, "Triumph", 123456, 220);
        
        System.out.println("Car Details: ");
        c1.displayVehicleInfo();
        System.out.println("Tax: " + c1.calculateTax());
        System.out.println("Final Price: " + c1.calculateFinalPrice());
        
        System.out.println("\nBike Details: ");
        b1.displayVehicleInfo();
        System.out.println("Tax: " + b1.calculateTax());
        System.out.println("Final Price: " + b1.calculateFinalPrice());
    }
}