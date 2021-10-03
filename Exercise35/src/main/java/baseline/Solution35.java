/*
 *  UCF COP3330 Fall 2021 Assignment 35 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

package baseline;

import java.lang.String;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Solution35
{
    /*
    public static int index(arrayList<string> nameList; for list of names
    {Random random = new Random(); return random.nextInt(nameList.size()); }

     */
    public static int index(ArrayList<String> nameList)
    {
        Random random = new Random();
        return random.nextInt(nameList.size());
    }
    public static void main(String[] args)
    {
        /*
        Void main
        new scanner input
        ArrayList<string> nameList = new ArrayList <>();
        Print "Enter a name: " and scan it
        if name is blank, then end program and print random name
         */
        Scanner input = new Scanner(System.in);
        String name;
        ArrayList<String> nameList = new ArrayList<>();

        do {
            System.out.println("Enter a name: ");
            name= input.nextLine();

            if(!name.isBlank() && !name.isEmpty())
                nameList.add(name);

        }while(!name.isBlank() && !name.isEmpty());

        int randomIndex = index(nameList);

        System.out.println("The winner is... "+nameList.get(randomIndex)+".");
    }
}