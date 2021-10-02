package baseline;

import java.util.Scanner;
public class solution29{
    //void main (String[] args)
        public static void main(String[] args)

        //Scanner
        // int r
        //boolean flag= false
        //while(true)
        // try catch
{
    Scanner input=new Scanner(System.in);
    boolean flag=false;
    while(true)
    {
        /*try { flag = true;
	system print ("what is the rate of return?)
	int r = integer nex scan
	System print ("it will take +(72/r)+ years to double your investment.
	}
	Catch (NumberFormatException)
	Catch (ArithmeticException)
	System print ("Sorry that's not a valid input.")
	*/
        try
        {
            System.out.print("What is the rate of return? ");
            int r=Integer.parseInt(input.next());
            System.out.println("It will take "+(72/r)+" years to double your initial investment.");
            flag=true;
        }
        catch(NumberFormatException | ArithmeticException e)
        {
            System.out.println("Sorry. That's not a valid input.");
        }
        if(flag)
        {
            break;
        }

    }
}
}
