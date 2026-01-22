package WorkshopWeek12;

public class Bus {

    String numberPlate;
    String color;
    String route;
    String customerName;
    boolean availableStatus;
    int rate;

    public Bus(String numberPlate, String color, String route, String customerName, boolean availableStatus, int rate) {
        this.numberPlate = numberPlate;
        this.color = color;
        this.route = route;
        this.customerName = customerName;
        this.availableStatus = availableStatus;
        this.rate = rate;
    }

    public void displayBusDetails() {
        System.out.println("\nNumber Plate: " + numberPlate +
        "\nColor: " + color +
        "\nRoute: " + route +
        "\nCustomer Name: " + customerName +
        "\nAvailable: " + availableStatus +
        "\nRate: " + rate
        );
    }
}
