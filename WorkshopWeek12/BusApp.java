package WorkshopWeek12;

public class BusApp{
    public static void main(String[] args){

        BusCompany company = new BusCompany();

        company.addBus(new Bus("BA-1234", "Red", "A-B", "Ram", true, 600));
        company.addBus(new Bus("BA-5678", "Green", "B-C", "Shyam", false, 450));
        company.addBus(new Bus("BA-9999", "Blue", "C-D", "Hari", true, 700));

        System.out.println("All Buses:");
        company.displayAllBuses();

        System.out.println("\nRate > 500:");
        company.displayBusRateMoreThan500();

        System.out.println("\nRed or Blue Buses:");
        company.displayRedOrBlueBuses();

        company.removeBus(5); 
    }
}
