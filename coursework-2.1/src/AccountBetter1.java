/**
 * Created by richard on 14/10/14.
 */
public class AccountBetter1 extends Account implements Transfer {

    @Override
    public boolean transferFrom(Account from, double amount) {
        from.withdraw(amount);
        return true;
    }

    @Override
    public boolean transferTo(Account to, double amount) {
        to.deposit(amount);
        return false;
    }
}

interface Transfer
{
    public boolean transferFrom( Account from, double amount );
    public boolean transferTo( Account to, double amount );
}