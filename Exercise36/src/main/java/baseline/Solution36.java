/*
 *  UCF COP3330 Fall 2021 Assignment 36 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

package baseline;

import java.lang.String;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Solution36
{
    public static void main(String[] args)
    {
        /*
        Public void main (String [] args)
        Scanner input = scanner(system.in);
        ArrayList<int> numbers = new ArrayList<>()
        String entry;
         */
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        String entry;

        do
        {
            /*
            print "Enter a number: "
            entry = input.next();
                if (!entry.equals("done"))
                    { int num = integer.entry
                    numbers.add(Num)}
              while (!entry.equals("done"))
             */
            System.out.println("Enter a number: ");
            entry = input.next();

            if(!entry.equals("done"))
            {
                int num = Integer.parseInt(entry);
                numbers.add(num);

            }
        }while(!entry.equals("done"));

        /*
        Print statements for each function, call functions for average, max, min, and standard deviation
         */
        System.out.println("Numbers: "+numbers.stream().map(String::valueOf).collect(Collectors.joining(", ")));

        System.out.println("The average is "+average(numbers));

        System.out.println("The minimum is "+min(numbers));

        System.out.println("The maximum is "+max(numbers));

        System.out.println("The standard deviation is "+String.format("%.2f", std(numbers)));
    }

    /*
    Average function
    public static double average {
    int total = 0;
    for (int num: numbers)
        {
            total =+ num;  counts numbers to total  (adds all numbers to total so that you can divide later)
        }
        return total/numbers.size (average formula)
     */
    public static double average(ArrayList<Integer> numbers)
    {
        int total = 0;

        for(int num: numbers)
        {
            total += num;
        }
        return (double)(total)/numbers.size();
    }

    /*
    Max function
    public static int max (
    ArrayList<Integer> numbers)
    for (int num: numbers)
        {
            if num>max
                max = num; (loops till the largest number)
        }
        return max
     */

    public static int max(ArrayList<Integer> numbers)
    {
        int max= numbers.get(0);

        for(int num: numbers)
        {
            if(num > max)
                max = num;
        }

        return max;
    }

    /*
    Min function
    public static int max (
    ArrayList<Integer> numbers)
    for (int num: numbers)
        {
            if num<min
                min = num; (loops till the smallest number)
        }
        return min
     */
    public static int min(ArrayList<Integer> numbers)
    {
        int min= numbers.get(0);

        for(int num: numbers)
        {
            if(num < min)
                min = num;
        }

        return min;
    }

    /*
    standard deviation function
    {
        double mean = average(numbers);
        double sum = 0;
        for(int num: numbers)
        {
            sum = sum + Math.pow((num-mean), 2);
        }
        return Math.sqrt(sum/numbers.size());
    }
}
 */
    public static double std(ArrayList<Integer> numbers)
    {
        double mean = average(numbers);

        double sum = 0;
        for(int num: numbers)
        {
            sum = sum + Math.pow((num-mean), 2);
        }

        return Math.sqrt(sum/numbers.size());
    }
}