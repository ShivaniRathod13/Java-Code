package classandobject;

import com.oops.classandobject.Account;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {
    private Account account;

   @Before
    public void setUp() {
        account = new Account();
        account.create(123456, "rothi", "rohit@gmail.com", 10000);
    }

    @Test
    public void testDeposit() {
        account.deposit(500);
        assertEquals(10500, account.amount, 0.001);
    }

    @Test
    public void testWithdraw() {
        account.withdraw(500);
        assertEquals(9500, account.amount, 0.001);
    }

    @Test
    public void testWithdrawInsufficientBalance() {
        account.withdraw(15000);
        assertEquals(10000, account.amount, 0.001);
    }

    @Test
    public void testCheckBalance() {
        assertEquals(10000, account.amount, 0.001);
    }
}
