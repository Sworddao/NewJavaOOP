package WorkshopWeek9;

public class Vehicle{

    int vehicleID;
    String brand;
    double basePrice;

    Vehicle(int vehicleID, String brand, double basePrice){
        this.vehicleID = vehicleID;
        this.brand = brand;
        this.basePrice = basePrice;
    }
    
    double calculateTax(){
        return basePrice * 0.10;
    }
    
    void displayVehicleInfo(){
        System.out.println("Vehicle ID: " + this.vehicleID);
        System.out.println("Brand: " + this.brand);
        System.out.println("Base Price: " + this.basePrice);
    }

}
