package session1;

import org.junit.jupiter.api.Test;
import session1.bankAccount;
import session1.notEnoughFundsException;
import static org.junit.jupiter.api.Assertions.*;

class ExpectedExceptionTest {

    @Test
    void notEnoughFunds() {
        // Create an object for BankAccount class
        bankAccount account = new bankAccount(9);

        // Assertion for exception
        assertThrows(notEnoughFundsException.class, () -> account.withdraw(10),
                "Balance must be greater than amount of withdrawal");
    }

    @Test
    void enoughFunds() {
        // Create an object for BankAccount class
        bankAccount account = new bankAccount(100);
    
        // Assertion for no exceptions
        assertDoesNotThrow(() -> account.withdraw(100));
    }
}