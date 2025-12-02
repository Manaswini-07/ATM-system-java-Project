import java.util.Scanner;
class ATM {
    private double balance = 10000;
    private String pin = "1234";
    public boolean checkpin(String inputpin)
    {
        return inputpin.equals(pin);
    }
    public void checkBalance(){
        System.out.println("You Balance" + balance);

    }
    public void deposit(double amount){
        if(amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited:" + amount);
        }
    }
    public void withdraw(double amount) {
        if(amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdraw" + balance);

        }else{
            System.out.println("Insufficient balance" + balance);
        }
    }
    
}
public class ATMsystem{
    public static void main(String[] Args)
    {
        Scanner sc = new Scanner(System.in);
        ATM at =  new ATM();
        System.out.println("Enter your pin:" );
        String inputpin = sc.nextLine();
        if(!at.checkpin(inputpin)){
            System.out.println("The pin is Invalid");
            return;

        }
        while(true){
            System.out.println("---ATM Menu---");
            System.out.println("1. Check Balance");
            System.out.println("2.Deposit");
            System.out.println("3.withdraw");
            System.out.println("4.Exit");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    at.checkBalance();
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit:");
                    double depositAmount = sc.nextDouble();
                    at.deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Enter the amount to withdraw:");
                    double withdrawamount =  sc.nextInt();
                    at.withdraw(withdrawamount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    return;
                default:
                    System.out.println("KInvalid choice. Please Try again.");

            }
        }

        }

}