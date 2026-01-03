public class Main {
    public static void main(String[] args) {
        System.out.println("------ Savings Account ------");
        SavingsAccount sa = new SavingsAccount("12345678", "Lecturer", 2000);
        sa.displayDetails();
        sa.deposit(-300);
        sa.withdraw(500);
        sa.calculateInterest();
        sa.displayDetails();

        System.out.println("------ Current Account ------");
        CurrentAccount ca = new CurrentAccount("87654321", "Student", 1000);
        ca.displayDetails();
        ca.deposit(500);
        ca.withdraw(200);
        ca.chargeMonthlyFee();
        ca.displayDetails();
    }
}