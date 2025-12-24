package WorkshopWeek8;

public class Atm{
    public static void main(String[] args){
        
        BankAccount account = new BankAccount(1234568919L, 100000, "Sai");
        
        //check intial balance 
        System.out.println("Current Balance: " + account.getBalance());
        
        //deposit money
        account.deposit(5000);
        System.out.println("Your balance after deposit: " + account.getBalance());
        
        //withdraw money
        account.withdraw(500);
        System.out.println("Your balance after withdraw: " + account.getBalance());
        
    }
}