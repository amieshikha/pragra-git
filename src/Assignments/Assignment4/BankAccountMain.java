package Assignments.Assignment4;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bc= new BankAccount(12345, "Shikha Sharma", 5000, "Chequeing account");
        bc.depositMoney();
        bc.withdrawMoney();

    }
}
