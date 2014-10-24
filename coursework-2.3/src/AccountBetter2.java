/**
 * Created by richard on 20/10/14.
 */

import java.math.*;

public class AccountBetter2 extends AccountBetter1 implements Interest
{

    @Override
    public boolean inCredit()
    {
        if(getBalance() >= 0.0)
        {
            return true;
        }
        return false;
    }

    @Override
    public void creditCharge()
    {
        double interestRate = 0.00026116;
        double interestCharged = 0;
        interestCharged = ( getBalance() * interestRate);
        if(!inCredit())
        {
            if(getOverdraftLimit() < (getBalance() + interestCharged))
            {
                deposit(interestCharged);
            }
            else if(getOverdraftLimit() > (getBalance() + interestCharged))
            {
                setOverdraftLimit(getBalance() + interestCharged);
                deposit(interestCharged);
            }
        }
    }
}

interface Interest
{
    public boolean inCredit();
    public void creditCharge();
}
