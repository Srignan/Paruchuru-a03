/*
 *  UCF COP3330 Fall 2021 Assignment 25 Solutions
 *  Copyright 2021 Srignan Paruchuru
 */

package baseline;

import java.util.Scanner;
public class Solution25
{
    public static void main(String[] args)
    {
        String str;
        Scanner input = new Scanner(System.in); //State scanner
        System.out.print("Enter Password: ");
        str = input.nextLine();  // scan user input; input.nextLine
        String answer = strengthofpass.passwordValidator(str);  //String ans = obj.passwordValidator(str)
        System.out.println(answer); //print answer
    }
}