// Bank class definition
class Bank {
    // Fields for accountType and accountBalance
    private String accountType;
    private double accountBalance;

    // Parameterized constructor to set accountType and accountBalance
    public Bank(String accountType, double accountBalance) {
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    // Method to deposit an amount and return the updated balance
    public double deposit(double amount) {
        accountBalance += amount;
        return accountBalance;
    }

    // Method to withdraw an amount and return the updated balance
    public double withdrawal(double amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
        return accountBalance;
    }

    // Method to display account details
    public void display() {
        System.out.println("The account type is " + accountType + " and the balance is " + accountBalance);
    }
}

// Insurance class that inherits from Bank
class Insurance extends Bank {
    // Constructor for Insurance class, calling the superclass constructor
    public Insurance(String accountType, double accountBalance) {
        super(accountType, accountBalance);
    }

    // Method to indicate coverage
    public void cover() {
        System.out.println("You are covered");
    }
}

// Main class with the main method
public class Main {
    public static void main(String[] args) {
        // Create an instance of the Bank class using your initials as the accountType
        // and your registration number (without the characters) as the accountBalance
        Bank myAccount = new Bank("TC", 230708);

        // Invoke the display method to show the account details
        myAccount.display();
    }
}
