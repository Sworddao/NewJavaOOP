package WorkshopWeek8;

public class BankAccount{
    
    private long accountNumber;
    private double balance;
    private String name;
    
    public BankAccount(long accountNumber, double balance, String name){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }else{
            System.out.println("Invalid amount");
        }
    }
    
    public boolean withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            return true;
        }else{
            System.out.println("Invalid amount");
            return false;
        }
    }
    
    
}