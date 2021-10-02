package baseline;

import java.lang.String;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Solution35
{
    public static int index(ArrayList<String> nameList)
    {
        Random random = new Random();
        int Index = random.nextInt(nameList.size());
        return Index;
    }
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        String name = null;
        ArrayList<String> nameList = new ArrayList<String>();

        do {
            System.out.println("Enter a name:");
            name= input.nextLine();

            if(!name.isBlank() && !name.isEmpty())
                nameList.add(name);

        }while(!name.isBlank() && !name.isEmpty());

        int randomIndex = index(nameList);



        System.out.println("The winner is... "+nameList.get(randomIndex));

    }
}