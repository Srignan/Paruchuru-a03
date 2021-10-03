/*
 *  UCF COP3330 Fall 2021 Assignment 37 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

package baseline;

import java.lang.String;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.*;

public class Solution37
{
    public static void main(String[] args)
    {
        /* Scanner set
        public void setPassword(){
        print("What's the minimum length? ");
        scan onto length
        print("How many special characters? ");
        scan onto spec
        print("How many numbers? ")
        scan onto numbs
        System.out.print(makePassword(length, spec, numbs));}
        */
        Scanner input = new Scanner(System.in);

        System.out.print("What's the minimum length? ");
        int size = Integer.parseInt(input.nextLine());

        System.out.print("How many special characters? ");
        int special = Integer.parseInt(input.nextLine());

        System.out.print("How many numbers? ");
        int numbers = Integer.parseInt(input.nextLine());

        System.out.println("Your password is " + generatePassword(size, special, numbers));
    }

    /*
       Public String makePassword(Int length, int spec, int num)
       char letter = a,b,c,d, through rest of alphabet
       char number = 0,1,2,3, through all single digits
       char special = '!',@,#,$,%,^,&,*,(,) etc.
     */
    public static String generatePassword(int length, int special, int numbs)
    {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        String specialCharacters = "!@#$%^&*()-_=+<>?~";

        String numbers = "1234567890";

        Random random = new Random();

        ArrayList<Character> chars = new ArrayList<>();

        for(int i = 0; i < special; i++)
        {
            chars.add(specialCharacters.charAt(random.nextInt(specialCharacters.length())));
        }

        for(int i = 0; i < numbs; i++)
        {
            chars.add(numbers.charAt(random.nextInt(numbers.length())));
        }


        for(int i = chars.size() - 1; i <length; i++)
        {
            chars.add(letters.charAt(random.nextInt(letters.length())));
        }


        Collections.shuffle(chars);
        StringBuilder password = new StringBuilder();
        for(Character s : chars)
        {
            password.append(s);
        }

        return password.toString();
    }
}

/*
    Scanner set
    public void setPassword(){
        print("What's the minimum length? ");
        scan onto length
        print("How many special characters? ");
        scan onto spec
        print("How many numbers? ")
        scan onto numbs
        System.out.print(makePassword(length, spec, numbs));}
    */


    /*
       Public String makePassword(Int length, int spec, int num)
            char letter array = 'a', 'b', through rest of alphabet
            char number array = '0', '1', through all single digits
            char[] special = {'!',@,#,$,%,^,&,*,(,)} etc.
    */

     /*
       int length = (spec+num)*2 (so that special and number characters don't overtake letters)
        if(length<minLen)
            length = minLen
        int numLetters = length-num-spec;
    */
    /*
       int numLetters = length-num-spec;
        for(int i=0; i<length; i++)
            length = minLen
        int randomChar = math.random *3);
        (to make switch statements for the three different char types and randomize which is chosen)
        switch case 0: if(numLetters != 0){
                       letters(Math.random() * 26)
               case 1: if(num != 0){
                       letters(Math.random() * 10)
               case 2: if(spec != 0){
                       letters(Math.random() * 17)
               break;
    */

//The above was my original pseudocode, and I used a different class for the function.
//I deleted the class because it did not work as intended, so I copied the pseudocode to show
// what I had on the first push for this solution. Please be kind.