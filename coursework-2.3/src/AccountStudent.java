/**
 * Created by richard on 24/10/14.
 */
public class AccountStudent extends AccountBetter2
{
    @Override
    public void creditCharge()
    {
        if(getBalance() < -5000)
        {
            double interestRate = 0.00026116;
            double interestCharged = 0;
            interestCharged = (getBalance() * interestRate);
            if (!inCredit())
            {
                if (getOverdraftLimit() < (getBalance() + interestCharged))
                {
                    deposit(interestCharged);
                } else if (getOverdraftLimit() > (getBalance() + interestCharged))
                {
                    setOverdraftLimit(getBalance() + interestCharged);
                    deposit(interestCharged);
                }
            }
        }
    }
}
