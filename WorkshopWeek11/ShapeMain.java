package WorkshopWeek11;

public class ShapeMain{
    public static void main(String[] args){
        
        Shape[] shapes=new Shape[3];

        shapes[0]=new Rectangle(10,20);
        shapes[1]=new Circle(30);
        shapes[2]=new Rectangle(50,40);

        for(int i=0;i<3;i++){
           shapes[i].draw();
            shapes[i].displayShapeInfo();
        }
        
    }
}