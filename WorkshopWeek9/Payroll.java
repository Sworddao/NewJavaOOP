package WorkshopWeek9;

public class Payroll{
    public static void main(String[] args){

        PermanentEmployee pe = new PermanentEmployee(1, "Sai", 4444774, 8500);
        ContractEmployee ce = new ContractEmployee(2, "Ing", 44664, 5);

        System.out.println("Permanent Employee Details:");
        pe.displayEmployeeInfo();
    
        System.out.println("\nContract Employee Details:");
        ce.displayEmployeeInfo();
    }
}