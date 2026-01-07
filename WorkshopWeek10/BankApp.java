package WorkshopWeek10;

public class BankApp{
    public static void main(String[] args){
        
        SavingsAccount saving = new SavingsAccount(123, "Sai", 4657890);
        CurrentAccount current = new CurrentAccount(123, "Sai", 651231);
        
        System.out.println("----Savings Account----");
        System.out.println(saving);
        System.out.println("Interest at 8% interest: " + saving.calculateInterest(0.08));
        System.out.println();
        System.out.println("----Current Account----");
        System.out.println(current);
        System.out.println("Interest at 4% interest: " + current.calculateInterest(0.04));
    }
}