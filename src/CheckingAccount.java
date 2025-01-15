// CheckingAccount.java
public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(int accountNumber, String accountHolder, double overdraftLimit) {
        super(accountNumber, accountHolder);
        this.overdraftLimit = overdraftLimit;
    }

    /*
    Override the withdraw method to check if the withdrawal exceeds the overdraft limit.
    Use assertions to determine if amount greater than 0. Perform withdraw operation.
    Override the deposit method to check if the deposit is greater than 0.
    Use assertions to determine if amount is greater than 0. Perform deposit operation.
     */

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}