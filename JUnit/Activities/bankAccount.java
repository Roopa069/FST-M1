package session1;

public class bankAccount {
    private Integer balance;
    
    // Create a constructor
    public bankAccount(Integer initialBalance) {
        balance = initialBalance;
    }

    // Add method to calculate
    // balance amount after withdrawal
    public Integer withdraw(Integer amount) {
        if (balance < amount) {
            throw new notEnoughFundsException(amount, balance);
        }
        balance -= amount;
        return balance;
    }
}
