/*
 *  UCF COP3330 Fall 2021 Assignment 32 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

package baseline;

import java.util.Scanner;

public class GuessingGame {
    private static final Scanner in = new Scanner(System.in);

    //Difficult option function
    // System print "Enter difficulty level"
    //return checkDifficulty()
    public int getDifficulty(){
        System.out.print("Enter the difficulty level (1,2, or 3): ");
        return checkDifficulty();
    }
    /*
    public void game(){
        int numGuesses
        int guess
        int answer
        boolean playAgain = true;

        while(playAgain){
            guess = 0;
            numGuesses = 0;
            answer = ((int) (Math.random() * (Math.pow (10, getDifficulty())))); 10, 100, 1000
            print "I have my number. What's your guess? "
     */
    public void game(){
        int numGuesses;
        int guess;
        int answer;
        boolean playAgain = true;

        while(playAgain){

            guess = 0;
            numGuesses = 0;

            answer = ((int) (Math.random()*(Math.pow(10,getDifficulty())))) + 1;
            System.out.print("I have my number. What's your guess? ");

            /*
            while (guess != answer){
                guess = check(in.next());
                numGuesses++;
                if(guess == answer){
                    System print ("You got it in "+numGuesses+" guesses!")
                else if(guess < answer){
                    System.out.print("Too low. Guess again: ");
                }
                else {
                    System.out.print("Too high. Guess again: ");
             */
            while(guess != answer){
                guess = check(in.next());
                numGuesses++;
                if(guess == answer){
                    System.out.println("You got it in "+numGuesses+" guesses!");
                }
                else if(guess == -1){
                    System.out.print("Try guessing a number ");
                }
                else if(guess < answer){
                    System.out.print("Too low. Guess again: ");
                }
                else {
                    System.out.print("Too high. Guess again: ");
                }
            }
            playAgain = askAgain();
        }
    }
    /*
    Replay function
    System print "Do you wish to play again? (Y/N)"
    String input = in.next()
    return input.equals("Y")
     */
    public boolean askAgain(){
        System.out.print("Do you wish to play again (Y/N)? ");
        String input = in.next();
        return input.equals("Y") || input.equals("y");
    }

    public int checkDifficulty(){
        while(true) {
            try {
                return Integer.parseInt(in.next());
            } catch (NumberFormatException e) {
                System.out.print("The input must be numeric. Please enter a number now.\n");
            }
        }
    }

    public int check(String x){
        while(true) {
            try {
                return Integer.parseInt(x);
            } catch (NumberFormatException e) {
                return -1;
            }
        }
    }
}