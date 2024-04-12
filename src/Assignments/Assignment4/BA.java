package Assignments.Assignment4;

// Create a BankAccount class with properties accountNumber, accountHolderName, balance, accountType.
// Write a constructor to initialize these properties when creating a BankAccount object.
// Include methods to deposit and withdraw money, and a method to display the account details.

public class BA {
    int accountNumber;
    String accountHolderName;
    int balance;
    String accountType;

    public BA(int accountNumber, String accountHolderName, int balance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
        System.out.println("Account number is " + accountNumber);
        System.out.println("Account holder name : " + accountHolderName);

        System.out.println("Account balance is :" +balance);
        System.out.println("Account type is: " +accountType);}
    public void depositMoney(){
        System.out.println("Depositing cash");
    }
    public void withdrawMoney(){
        System.out.println("Withdrawing Cash");
    }
    public void accountDetails()
    {
        System.out.println("_____________________________________");
        System.out.println("Account number is " + accountNumber);
        System.out.println("Account holder name : " + accountHolderName);

        System.out.println("Account balance is :" +balance);
        System.out.println("Account type is: " +accountType);
    }

}

