package WorkshopWeek11;

public abstract class Crop{
    
    String cropName;
    String season;
    double landArea;
    
    public Crop(String cropName, String season, double landArea){
        this.cropName = cropName;
        this.season = season;
        this.landArea = landArea;
    }
    
    public abstract double calculateYield();
    public abstract double calculateWaterRequirement();
    
    public void displayCropInfo(){
        System.out.println("Crop Name: " + this.cropName);
        System.out.println("Season: " + this.season);
        System.out.println("Land Area: " + this.landArea);
        System.out.println("Estimated Yield: " + calculateYield());
        System.out.println("Water Requirement: " + calculateWaterRequirement());
    }
}