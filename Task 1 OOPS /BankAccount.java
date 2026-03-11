public abstract class BankAccount{
    private String accountNumber;
    public double balance;

    public BankAccount(String accountNumber, double balance){
        if (balance<0){
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InvalidAmountException, InsufficientBalanceException{
        if (amount<0){
            throw new InvalidAmountException("withdraw amount must be positive");
        }
        if (amount>balance){
            throw new InsufficientBalanceException("Withdraw amount must be smaller than account balance");
        }
        balance-=amount;
    }

    public double getbalance(){
        return balance;
    }

    public String getAccountnumber(){
        return accountNumber;
    }

     public abstract double calculateInterest();
}
