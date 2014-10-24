/**
 * Created by richard on 14/10/14.
 */
public class AccountBetter1 extends Account implements Transfer
{

    @Override
    public boolean transferFrom(Account from, double amount)
    {
        if (amount > 1)
        {
            from.withdraw(amount);
            this.deposit(amount);
            return true;
        }
        return false;
    }

    @Override
    public boolean transferTo(Account to, double amount)
    {
        if (amount > 1) {
            to.deposit(amount);
            this.withdraw(amount);
            return true;
        }
        return false;
    }
}

interface Transfer
{
    public boolean transferFrom( Account from, double amount );
    public boolean transferTo( Account to, double amount );
}