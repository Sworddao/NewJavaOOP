package WorkshopWeek9;

public class CurrentAccount extends BankAccount{
    
    int overDraftLimit;
    double initialBalance;
    
    CurrentAccount(int accountNumber, String accountHolderName, double balance, int overDraftLimit){
        super(accountNumber, accountHolderName, balance);
        this.overDraftLimit = overDraftLimit;
    }
    
    boolean withdraw(double amount){
        initialBalance = balance;
        if(amount <= balance + overDraftLimit){
            balance -= amount;
            return true;
        }else{
            System.out.println("Invalid amount");
            return false;
        }
    }
    
    void displayBankAccountInfo(){
        super.displayBankAccountInfo();
        System.out.println("Initial Balance: " + initialBalance);
        System.out.println("Over draft limit: " + overDraftLimit);
    }
    
}