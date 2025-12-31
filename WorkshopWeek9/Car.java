package WorkshopWeek9;

public class Car extends Vehicle{
    
    int numDoors;
    String fuelType;
    
    Car(int vehicleID, String brand, double basePrice, int numDoors, String fuelType){
        super(vehicleID, brand, basePrice);
        this.numDoors = numDoors;
        this.fuelType = fuelType;
    }
    
    double calculateFinalPrice(){
        return basePrice + calculateTax() + super.basePrice * 0.05;
    }
    
    void displayVehicleInfo(){
        super.displayVehicleInfo();
        System.out.println("Number of Doors: " + numDoors);
        System.out.println("Fuel Type: " + fuelType);
    }
}