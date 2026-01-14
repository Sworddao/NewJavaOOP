package WorkshopWeek11;

public class Rectangle extends Shape implements Drawable{
    
    private double length;
    private double breadth;
    
    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    
    @Override
    public double calculateArea(){
        return this.length * this.breadth;
    }
    
    @Override
    public double calculatePerimeter(){
        return 2 * (this.length + this.breadth);
    }
    
    public void draw(){
        System.out.println("Drawing a rectangle");
    }
}