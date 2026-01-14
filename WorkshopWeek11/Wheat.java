package WorkshopWeek11;

public class Wheat extends Crop implements Transportable {

    public Wheat(double landArea) {
        super("Wheat", "Winter", landArea);
    }

    @Override
    public double calculateYield() {
        return landArea * 2.8;
    }

    @Override
    public double calculateWaterRequirement() {
        return landArea * 700;
    }

    @Override
    public double calculateTransportCost() {
        return landArea * 400;
    }

    @Override
    public String getTransportMethod() {
        return "Tractor or Pickup";
    }
}
