package WorkshopWeek8;

public class ElectricityBillTest{
    public static void main(String[] args){

        ElectricityBill bill = new ElectricityBill("Sai", 70);
        
        bill.setUnitsConsumed(180);
        bill.displayBill();
    }
}