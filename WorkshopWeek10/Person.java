package WorkshopWeek10;

public class Person{
    
    private int id;
    private String name;
    
    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public int getID(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public void setID(int newID){
        this.id = newID;
    }
    
    public String toString(){
        return "ID: " + id + "\nName: " + name;
    }
    
    public double calculateSalary(){
        return 0;
    }
    
}