package baseline;

import java.util.*;
public class strengthofpass {
    public static String passwordValidator(String input)
    {
        // boolean false for has lower, hasDigit, specialChar

        int n = input.length();
        boolean hasLower = false, hasUpper = false,
                hasDigit = false, specialChar = false;

        Set<Character> set = new HashSet<>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));

        //for char i : input.toCharArray()
        for (char i : input.toCharArray())
        {
            // if character.is lower case, isDigit, hasDigit, specialChar(true for all)
            //this is to check for characters and cover case
            if (Character.isLowerCase(i))
                hasLower = true;
            if (Character.isUpperCase(i))
                hasUpper = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                specialChar = true;
        }

        //if (hasDigit && (hasLower || hasUpper) && specialChar && (n >= 8)) = Very Strong
        //else if ((hasLower || hasUpper || hasDigit) && (n >= 8)) = Strong
        //else if(hasLower || hasUpper && (n < 8)) = Weak
        //else very weak
        if (hasDigit && (hasLower || hasUpper) && specialChar && (n >= 8))
            return "This password is very strong.";

        else if ((hasLower || hasUpper || hasDigit) && (n >= 8))
            return "This password is strong.";

        else if(hasLower || hasUpper && (n < 8))
            return "This password is weak.";

        else
            return "This password is very weak.";

    }
}
