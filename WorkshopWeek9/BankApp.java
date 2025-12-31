package WorkshopWeek9;

public class BankApp{
    public static void main(String[] args){
        
        SavingAccount sa = new SavingAccount(123456789, "Sai", 765000, 12.5);
        CurrentAccount ca = new CurrentAccount(123456789, "Sai", 475620, 20000);
        
        System.out.println("Saving Account Details: ");
        sa.displayBankAccountInfo();
        System.out.println("\nCurrent Account Details: ");
        ca.withdraw(2000);
        ca.displayBankAccountInfo();
    }
}