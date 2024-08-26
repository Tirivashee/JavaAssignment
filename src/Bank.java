// Bank class definition
class Bank {
    // Fields for accountType and accountBalance
    private String accountType;
    private double accountBalance;

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
}
