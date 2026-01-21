package WorkshopWeek12;
import java.util.ArrayList;

public class BusCompany{

    ArrayList<Bus> buses = new ArrayList<>();
    
    public void addBus(Bus bus){
        buses.add(bus);
    }

    public void removeBus(int index){
        if(index >= 0 && index < buses.size()){
            buses.remove(index);
        }else{
            System.out.println("Error: Invalid index!");
        }
    }

    public void displayAllBuses(){
        for(Bus b : buses){
            b.displayBusDetails();
        }
    }

    public void displayBusRateMoreThan500(){
        for(Bus b : buses){
            if (b.rate > 500){
                b.displayBusDetails();
            }
        }
    }

    public void displayRedOrBlueBuses(){
        for(Bus b : buses){
            if (b.color.equalsIgnoreCase("red") || b.color.equalsIgnoreCase("blue")) {
                b.displayBusDetails();
            }
        }
    }
}
