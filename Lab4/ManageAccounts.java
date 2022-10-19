// **********************************************************************************
//   ManageAccounts.java
//
//   Use Account class to create and manage Sally’s and Joe’s bank accounts
// **********************************************************************************

public class ManageAccounts {
    public static void main(String[] args) {
        Account acct1, acct2;

        // Create account1 for Sally with $1000
        acct1 = new Account(1000, "Sally", 1111);

        // Create account2 for Joe with $500
        acct2 = new Account(500, "Joe", 1112)

        // Deposit $100 to Joe’s account
        acct2 = new Deposit(100);

        // Print Joe’s new balance (use getBalance())

        // Withdraw $50 from Sally’s account

        // Print Sally’s new balance (use getBalance())

        // Charge fees to both accounts

        // Change the name on Joe’s account to Joseph

        // Print summary for both accounts
    }
}
