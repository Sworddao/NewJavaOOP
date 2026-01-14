package WorkshopWeek11;


public class Maize extends Crop implements Transportable {

    public Maize(double landArea) {
        super("Maize", "Summer / Hill", landArea);
    }

    @Override
    public double calculateYield() {
        return landArea * 2.2;
    }

    @Override
    public double calculateWaterRequirement() {
        return landArea * 400; 
    }

    @Override
    public double calculateTransportCost() {
        return landArea * 300;
    }

    @Override
    public String getTransportMethod() {
        return "Mule / Manual Carry (Remote Hills)";
    }
}