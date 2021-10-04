/*
 *  UCF COP3330 Fall 2021 Assignment 31 Solution
 *  Copyright 2021 Srignan Paruchuru
 */

package baseline;
import java.util.Scanner;

public class Solution31 {
    public static void main(String[] args) {
        HeartRate();
    }

        public static void HeartRate(){
        //int restingHR, age
        //scanner
        //restingHR = scanner.nextInt
        //age= scanner.nextInt

        int restingHR, age;
        Scanner input = new Scanner(System.in);
        System.out.print("What is your resting heart rate? ");
        restingHR = input.nextInt();
        System.out.print("What is your age? ");
        age = input.nextInt();

        //system out print ("Resting pulse: " + restingHR + " Age: " + age);
        System.out.println("Resting Pulse: " + restingHR + " Age: " + age);

        // int intensity = 55; (sample output starts at 55)
        int intensity = 55;
        System.out.println("Intensity | Rate ");
        System.out.println("------------------------");

        // while intensity=<95
        //int target = ((220-age) - restingHR) *intensity +restingHR
        //print out (intensity+ "% | "+Target +"bpm")
        while (intensity <= 95) {
            double Target = (((220 - age) - restingHR) * intensity/100.00) + restingHR;
            System.out.println(intensity + "%       | " + String.format("%.0f",Target) + " bpm");
            intensity += 5;
        }
    }
}