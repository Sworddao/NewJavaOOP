package WorkshopWeek9;

public class Bike extends Vehicle{

    int engineCapacity;

    Bike(int vehicleID, String brand, double basePrice, int engineCapacity){
        super(vehicleID, brand, basePrice);
        this.engineCapacity = engineCapacity;
    }

    double calculateFinalPrice(){
        return basePrice + calculateTax();
    }

    void displayVehicleInfo(){
        super.displayVehicleInfo();
        System.out.println("Engine Capacity: " + engineCapacity);
    }
}