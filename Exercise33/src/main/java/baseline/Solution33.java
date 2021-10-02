/*
 *  UCF COP3330 Fall 2021 Assignment 33 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

package baseline;

import java.lang.String;
import java.util.Scanner;
import java.util.Random;

public class Solution33 {
    //void question()
    public static void question()
            //{State scanner
            // print "Whats your Question?"
            //scan.nextLine}
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your question?");
        input.nextLine();
    }
    public static void main(String[] args)
    {
        //void main (String[] args)
        // String [] responses = yes, no, maybe, ask again later
        String[] responses = {"Yes", "No", "Maybe", "Ask again later"};

        Random random = new Random();

        //Call question
        question();

        // int randomResponse = random.nextInt
        int Response = random.nextInt(responses.length);

        // String response = responses[RandomResponse]
        String response = responses[Response];

        //print response
        System.out.println();
        System.out.println(response);
    }
}

//Didn't create a test case for this as scan does not impact output and output is random print string out of four
