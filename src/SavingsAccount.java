public class SavingsAccount extends Account {
    private double interestRate;
    private int withdrawalLimit;
    private int withdrawalsMade;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
        // super(...) (with parentheses): Calls the Parent Constructor.
        interestRate = 0.03;
        withdrawalLimit = 3;
        withdrawalsMade = 0;
    }

    @Override
    public void withdraw(double amount) {
        if (withdrawalsMade >= withdrawalLimit) {
            System.out.println("Withdrawal limit reached.");
            return;
        }

        if (amount > 0 && amount <= balance) {
            super.withdraw(amount);
            // super.withdraw(...) (with a dot): Calls a Parent Method.
            withdrawalsMade++;
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    @Override
    public double calculateInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest added: RM" + interest);
        return interest;
    }
}
