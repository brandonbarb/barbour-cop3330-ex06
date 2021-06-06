/*
 *  UCF COP3330 Summer 2021 Assignment 6 Solution
 *  Copyright 2021 Brandon Barbour
 */

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("What is your current age? ");
        Scanner input = new Scanner(System.in);
        int current = input.nextInt();
        System.out.print("At what age would you like to retire? ");
        int target = input.nextInt();
        System.out.println("You have " + (target-current) + " years left until you can retire.");
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("It's " + year + ", so you can retire in " + (year + (target - current)) + ".");
    }
}
