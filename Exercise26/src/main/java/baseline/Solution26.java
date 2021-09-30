package baseline;


import java.util.Scanner;

public class Solution26 {
    //calculateMonthsUntilPaidOff(double balance, double apr, double payment)
    public static int calculateMonthsUntilPaidOff(double balance, double apr, double payment) {
        //i = apr / 365
        apr = apr / 365;
        //(int) Math.ceil((-1 / 30.0) * Math.log(1 + balance / payment * (1 - Math.pow(1 + apr, 30))) / Math.log(1 + apr))
        return (int) Math.ceil((-1 / 30.0) * Math.log(1 + balance / payment * (1 - Math.pow(1 + apr, 30))) / Math.log(1 + apr));

    }

    public static void main(String[] args) {
        //state variables balance, i, apr, payment

        Scanner input = new Scanner(System.in);
        double balance, apr, payment;

        //print "What is your balance?" input.nextDouble

        System.out.print("What is your balance? ");
        balance = input.nextDouble();

        //print "What is the APR on the card (as a percent)? "; input.nextDouble; i = apr/100

        System.out.print("What is the APR on the card (as a percent)? ");
        apr = input.nextDouble();
        apr = apr / 100;

        //print "What is the monthly payment you can make?" input.nextDouble

        System.out.print("What is the monthly payment you can make? ");
        payment = input.nextDouble();

        //Call function and print result

        int months = calculateMonthsUntilPaidOff(balance, apr, payment);
        System.out.println("It will take you " + months + " months to pay off this card.");
    }
}
