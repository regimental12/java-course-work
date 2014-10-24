class Main
{
    public static void main( String args[] )
    {
        AccountBetter1 mike = new AccountBetter1();
        AccountBetter1 cori = new AccountBetter1();
        Account miri = new Account();
        AccountBetter2 dave = new AccountBetter2();




        mike.deposit( 1.00);
        cori.deposit( 150.00 );
        miri.deposit( 100.00 );

//Transfer 10.00 from miri's account to mike's account
       mike.transferTo(cori , 1.00);

//Transfer 10.00 from mike's account to cori's account


        System.out.printf( "Mike = %5.2f\n", mike.getBalance() );
        System.out.printf( "Miri = %5.2f\n", miri.getBalance() );
        System.out.printf( "Cori = %5.2f\n", cori.getBalance() );

        dave.deposit(-100.00);
        dave.creditCharge();
        dave.creditCharge();
        dave.creditCharge();
        dave.creditCharge();
        System.out.printf( "dave = %5.2f\n", dave.getBalance() );
        System.out.printf( "dave = %5.2f\n", dave.getOverdraftLimit() );
    }

}
