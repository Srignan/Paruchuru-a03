/*
 *  UCF COP3330 Fall 2021 Assignment 24 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

package baseline;
import java.util.Arrays;
import java.util.Scanner;

public class Solution24 {
    // Create boolean isAnagram function; static boolean isAnagram(String 1, String 2)
    static boolean isAnagram(String A, String B) {
        // Make sure letter case does not matter; 1.toLowerCase = 1, 2.toLowerCase = 2
        A = A.toLowerCase();
        B = B.toLowerCase();
        //boolean f = false; serves as an else statement so if conditions aren't met, it doesn't pass
        boolean f = false;
        //New variable character arrays to keep track of variables, Array.sort to make the words have
        //the same order when checking if they are equal. ex. a v j a & j a v a would both sort to a a j v
        char[] c = A.toCharArray();
        Arrays.sort(c);
        char[] d = B.toCharArray();
        Arrays.sort(d);
        String a = new String(c);
        String b = new String(d);
        // if a.equals(b), then boolean is proven true
        if (a.equals(b)) {
            f = true;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.print("Enter the first string: ");
        String A=sc.nextLine();
        //print result, a + " and " + b + " are anagrams"
        System.out.print("Enter the second string: ");
        String B=sc.nextLine();
        if(isAnagram(A,B))
            System.out.println("\"" + A + "\" and \"" + B + "\" are anagrams.");
        else
            System.out.println("\"" + A + "\" and \"" + B + "\" are not anagrams.");
    }
}
