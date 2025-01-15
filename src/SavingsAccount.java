// SavingsAccount.java
public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, String accountHolder, double interestRate) {
        super(accountNumber, accountHolder);
        this.interestRate = interestRate;
    }

    /*
    Override the withdraw method to check if the withdrawal exceeds the balance.
    Use assertions to determine if amount is greater than 0. Perform withdraw operation.
    Override the deposit method to check if the deposit is greater than 0.
    Use assertions to determine if amount if greater than 0. Perform deposit operation.
     */

    public double getInterestRate() {
        return interestRate;
    }
}