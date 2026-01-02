package banking;

public class CurrentAccount extends Account {
    private double overdraftLimit;
    private double monthlyFee;
    private boolean feeCharged;

    public CurrentAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
        overdraftLimit = 500;
        monthlyFee = 10;
        feeCharged = false;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.printf("Withdrew: RM%.2f%n", amount);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit.");
        }
    }

    @Override
    public double calculateInterest() {
        return 0;
    }

    public void chargeMonthlyFee() {
        if (!feeCharged) {
            balance -= monthlyFee;
            feeCharged = true;
            System.out.printf("Monthly fee charged: RM%.2f%n", monthlyFee);
        }
    }
}