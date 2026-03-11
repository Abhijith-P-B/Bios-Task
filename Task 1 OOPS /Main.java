import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        BankAccount account = null;

        try{
            System.out.println("Choose Account Type : ");
            System.out.println("1. Savings Account ");
            System.out.println("2. Current account ");

            int choice = sc.nextInt();

            System.out.println("Enter Account Number : ");
            String accno = sc.next();

            System.out.println("Enter Initial Balance :");
            double accbalance = sc.nextDouble();

            if (choice == 1){
                account = new SavingsAccount(accno,accbalance);
            }
            else if(choice == 2){
                account = new CurrentAccount(accno,accbalance);
            }
            else {
                System.out.println("Inavlid choice ");
                return;
            }
            
            int option;

            do{
                System.out.println("Select Operation to be performed :");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. Calculate Interest");
                System.out.println("5. Exit");

                option = sc.nextInt();

                switch(option){
                    case 1: 
                        System.out.println("Enter amount to be deposited :");
                        double Depositammount = sc.nextDouble();
                        account.deposit(Depositammount);
                        System.out.println("Amount deposited ");
                        break;
                    case 2:
                        System.out.println("Enter amount to be withdrawn :");
                        double withdrawammount = sc.nextDouble();
                        account.withdraw(withdrawammount);
                        System.out.println(withdrawammount+"withdrawn succesfully ");
                        break;
                    case 3:
                        System.out.println("Current Balance : " + account.getbalance());
                        break;
                    case 4:
                        System.out.println("Calculated interest : " + account.calculateInterest());
                        break;
                    case 5:
                        System.out.println("Exited succesfully");
                        break;
                    default:
                        System.out.println("Invalid Option");
                } 
            } while (option != 5);
        }
        catch(InvalidAmountException e){
            System.out.println("Invalid Amount Error !!" + e.getMessage());
        }
        catch(InsufficientBalanceException e){
            System.out.println("Balance Error !! "+ e.getMessage());
        }
        catch(IllegalArgumentException e){
            System.out.println("Account initialization Error !! "+ e.getMessage());
        }
        finally {
            System.out.println("Thank you for using the Bank System.");
            sc.close();
        }
    }
}