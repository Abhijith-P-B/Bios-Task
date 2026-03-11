public class CurrentAccount extends BankAccount{

    public double interestrate = 2.0;

    public CurrentAccount(String accountNumber, double balance){
        super(accountNumber,balance);
    }

    @Override
    public double calculateInterest(){
        return (getbalance() * interestrate/100);
    }
}