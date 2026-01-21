package WorkshopWeek12;

public class Student{
    
    private String name;
    private long phone;
    private String group;
    
    public Student(String name, long phone, String group){
        this.name = name;
        this.phone = phone;
        this.group = group;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public long getPhone(){
        return this.phone;
    }
    
    public void setPhone(long newPhone){
        this.phone = newPhone;
    }
    
    public String getGroup(){
        return this.group;
    }
    
    public void setGroup(String newGroup){
        this.group = newGroup;
    }
    
    public void displayStudentDetails(){
        System.out.println("\nName: " + this.name + "\nPhone: " + this.phone + "\nGroup: " + this.group);
    }
}