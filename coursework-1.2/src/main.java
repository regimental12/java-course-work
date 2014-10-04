/**
 * Created by richard on 03/10/14.
 */

import java.util.Scanner;

public class main {

    static int number;

    public static void main(String[] args)
    {
        getInput();

        printTimesTable();

    }

    private static void printTimesTable()
    {
        for (int i = 1; i <= 12 ; i++)
        {
            System.out.printf("%d * %d = %d\n" , i , number , i*number);
        }
    }


    public static void getInput()
    {
        Scanner in = new Scanner(System.in);
        in.reset();

        System.out.println("#Enter a no. between 1 and 25");

        number = in.nextInt();

        if(number < 1 || number > 25)
        {
            getInput();
        }

    }
}
