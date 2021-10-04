/*
 *  UCF COP3330 Fall 2021 Assignment 28 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

package baseline;

import java.util.Scanner;

public class solution28 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //total=0
        int total = 0;
        //for (int i = 0; i < 5; i++) {
        //        print("Enter a number: ");
        //        total += in.nextInt();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            total += in.nextInt();
        }
        // print "The total is +total+."
        System.out.println("The total is " + total + ".");
    }
}


