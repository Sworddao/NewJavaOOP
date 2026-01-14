package WorkshopWeek11;

public abstract class Shape implements Drawable{
    
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    
    public void displayShapeInfo(){
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}