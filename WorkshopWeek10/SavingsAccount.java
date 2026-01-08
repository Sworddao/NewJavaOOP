package WorkshopWeek10;

public class SavingsAccount extends Account{
    
    public SavingsAccount(int accountNo, String holderName, double balance){
        super(accountNo, holderName, balance);
    }
    
    @Override
    public double calculateInterest(){
        return super.calculateInterest() + (getBalance() * 0.03); //extra 3%
    }
    
    public double calculateInterest(double rate){
        return getBalance() * rate;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nBase Interest Amount: "+ calculateInterest();
        
    }
}