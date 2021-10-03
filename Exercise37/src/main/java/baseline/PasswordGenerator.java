package baseline;

import java.util.Scanner;

public class PasswordGenerator {
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
}