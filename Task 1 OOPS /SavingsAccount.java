public class SavingsAccount extends BankAccount {

    private double interestrate = 5.0;
    
    public SavingsAccount(String accountNumber, double balance){
        super(accountNumber,balance);
    }

    @Override
    public double calculateInterest(){
        return (getbalance() * interestrate/100);
    }


}