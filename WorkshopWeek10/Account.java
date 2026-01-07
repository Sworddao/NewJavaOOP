package WorkshopWeek10;

public class Account{
    
    private int accountNo;
    private String holderName;
    private double balance;
    
    public Account(int accountNo, String holderName, double balance){
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }
    
    public int getAccountNo(){
        return this.accountNo;
    }
    
    public String getHolderName(){
        return this.holderName;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    public void setAccountNo(int newAccountNo){
        this.accountNo = newAccountNo;
    }
    
    public void setHolderName(String newHolderName){
        this.holderName = newHolderName;
    }
    
    public void setBalance(double newBalance){
        this.balance = newBalance;
    }
    
    public double calculateInterest(){
        return balance * 0.02; // taking 2% base interest
    }
    
    public String toString(){
        return "Account No: "+ this.accountNo + "\nHolder Name: " + this.holderName + "\nBalance: " + this.balance;
    }
}