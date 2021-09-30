/*
 *  UCF COP3330 Fall 2021 Assignment 24 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

package baseline;
/*

 */
import java.util.Arrays;
import java.util.Scanner;

public class Solution24 {
    // Create boolean isAnagram function; static boolean isAnagram(String 1, String 2)

        // Make sure letter case does not matter; 1.toLowerCase = 1, 2.toLowerCase = 2

        //boolean f = false; serves as an else statement so if conditions aren't met, it doesn't pass

        //New variable character arrays to keep track of variables, Array.sort to make the words have
        //the same order when checking if they are equal. ex. a v j a & j a v a would both sort to a a j v

        // if 1.equals(2), then boolean is proven true

        //print result, 1 + " and " + 2 + " are anagrams"