package WorkshopWeek9;

public class BankAccount{
    
    int accountNumber;
    String accountHolderName;
    double balance;
    
    BankAccount(int accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    
    void deposit(double amount){
        balance += amount;
    }
    
    double getBalance(){
        return balance;
    }
    
    void displayBankAccountInfo(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account holder name: " + accountHolderName);
        System.out.println("Current balance: " + balance);
    }
}