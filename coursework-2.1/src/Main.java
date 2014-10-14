class Main
{
    public static void main( String args[] )
    {
        Account mike    = new Account();
        Account corinna = new Account();

        double obtained;

        System.out.printf( "Mike's Balance      = %6.2f\n",
                mike.getBalance() );

        mike.deposit(100.00);
        System.out.printf( "Mike's Balance      = %6.2f\n",
                mike.getBalance() );

        obtained = mike.withdraw(20.00);
        System.out.printf( "Mike has withdrawn  : %6.2f\n", obtained );
        System.out.printf( "Mike's Balance      = %6.2f\n",
                mike.getBalance() );

        corinna.deposit(50.00);
        System.out.printf( "Corinna's Balance   = %6.2f\n",
                corinna.getBalance() );
    }

}
