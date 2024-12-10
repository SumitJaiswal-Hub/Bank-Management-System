
import java.util.Scanner;

class Account {
    double accountNumber;
    String accountHolderName;
    double balance;

    Account(double accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Getters
    public double getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Display account details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }

}

public class Bank {
    Account[] arr = new Account[10];

    int choice = 0;
    double balance = 0;

    void serveCustomer() {
        System.out.println("Bank Management System");
        System.out.println("Prees 1 to open account in this bank");
        System.out.println("Prees 2 to close account from this bank");
        System.out.println("prees 3 to add cash in your bank account");
        System.out.println("Prees 4 to withdraw cash from your bank account");
        System.out.println("Prees 5 to disply account in bank");
        System.out.println("prees 6 to Exit");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number...");
        choice = sc.nextInt();

        if (choice == 1) {
            openAccount();
        }
        //  else if (choice == 2) {
        //     closeAccount();
        // } else if (choice == 3) {
        //     addCash();
        // } else if (choice == 4) {
        //     withdrawcash();
        // } 
        else if (choice == 5) {
            displayAccount();
        } else if (choice == 6) {
            System.out.println("Exiting...");
        } else {
            System.out.println("Invalid input! Please enter 1 to 5.");
        }
    }

    // open account
    void openAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Holder Name: ");
        String accountHolderName = sc.nextLine();

        System.out.print("Enter Account Number: ");
        double accountNumber = sc.nextDouble();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        Account account = new Account(accountNumber, accountHolderName, balance);
        arr[0] = account;

        Account account1 = new Account(accountNumber, accountHolderName, balance);
        arr[1] = account1;

        Account account2 = new Account(accountNumber, accountHolderName, balance);
        arr[2] = account2;
        System.out.println("Account created successfully.");
    }

    // Delete Account
    // void closeAccount() {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter Account Number to delete: ");
    //     double accountNumber = sc.nextDouble();
    
    //     if (accountNumber == arr[0]) {
    //         arr[0] = null;
    //         System.out.println("Account deleted successfully.");
    //     }

    //     else {
    //         System.out.println("Account not found.");
    //     }
    // }

    // add cash
    // void addCash() {
    //     System.out.print("Enter Account Number: ");
    //     Scanner sc = new Scanner(System.in);
    //     String accountNumber = sc.nextLine();
    //
    //     BankAccount account = findAccount(accountNumber);
    //     if (account != null) {
    //         System.out.print("Enter Amount to Deposit: ");
    //         double amount = sc.nextDouble();
    //         sc.nextLine(); // Consume the newline
    //         account.deposit(amount);
    //     } else {
    //         System.out.println("Account not found.");
    //     }
    // }

    // withdraw Cash
    // void withdrawcash() {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter Account Number: ");
    //     String accountNumber = sc.nextLine();
    //
    //     BankAccount account = findAccount(accountNumber);
    //     if (account != null) {
    //         System.out.print("Enter Amount to Withdraw: ");
    //         double amount = sc.nextDouble();
    //         sc.nextLine(); // Consume the newline
    //         account.withdraw(amount);
    //     } else {
    //         System.out.println("Account not found.");
    //     }
    // }

   // Display Account
    void displayAccount() {
        
        for(int i=0; i < arr.length; i++){
            System.out.println("Account detals : "+ arr[i]);
        }
    }

    // Find Account Helper Method

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.serveCustomer();

    }

}