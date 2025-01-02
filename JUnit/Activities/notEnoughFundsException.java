package session1;

public class notEnoughFundsException extends RuntimeException {

    public notEnoughFundsException(Integer amount, Integer balance) {
        super("Attempted to withdraw " + amount + " with a balance of " + balance);
    }

}