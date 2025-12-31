    package WorkshopWeek9;
    
    public class Employee{
        
        int empID;
        String name;
        double basicSalary;
        
        Employee(int empID, String name, double basicSalary){
            this.empID = empID;
            this.name = name;
            this.basicSalary = basicSalary;
        }
        
        void displayEmployeeInfo(){
            System.out.println("Employee ID: " + empID);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee Salary: " + basicSalary);
        }
    }