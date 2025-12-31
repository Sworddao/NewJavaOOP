package WorkshopWeek9;

public class SavingAccount extends BankAccount{
    
    double interestRate;
    
    SavingAccount(int accountNumber, String accountHolderName, double balance, double interestRate){
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }
    
    double calculateInterest(){
        return balance * interestRate / 100;
    }
    
    void displayBankAccountInfo(){
        super.displayBankAccountInfo();
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Total with interest: " + (balance + calculateInterest()));
    }
}