/*
 *  UCF COP3330 Fall 2021 Assignment 34 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

package baseline;

import java.lang.String;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution34
{
    /*
    public static String removeName {
    scanner input = new scanner
        system print("Enter employee name to remove: ")
        return input.nextLine()
        }
    */
    public static String removeName()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an employee name to remove: ");
        return input.nextLine();
    }

    public static void main(String[] args)
    {
        /*
        ArrayList <String> employees = ("John Smith" , "Jackie Johnson"), etc. employee names
        Print "there are 'employee size' employees"

        call removeName()
        print "There are 'employee size' employees."
         */
        ArrayList<String> employees = new ArrayList<>(Arrays.asList("John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"));
        System.out.println("There are "+employees.size()+" employees: ");
        for(String emp:employees)
        {
            System.out.println(emp);
        }

        System.out.println();
        String nameToRemove = removeName();

        employees.remove(nameToRemove);

        System.out.println();
        System.out.println("There are "+employees.size()+" employees: ");
        for(String emp:employees)
        {
            System.out.println(emp);
        }
    }
}