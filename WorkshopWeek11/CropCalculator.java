package WorkshopWeek11;

public class CropCalculator {
    public static void main(String[] args) {

        Crop[] crops = {
            new Rice(30),
            new Wheat(10),
            new Maize(5)
        };

        for (int i = 0; i < crops.length; i++) {
            crops[i].displayCropInfo();
        }
    }
}
