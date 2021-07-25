package com.company.Functions;

import java.util.Scanner;

public class Main {

    static void cleanFloor(String room)
    {
        System.out.println("Cleaning the "+room+" now!");
    }

    static void showAlert()
    {
        System.out.println("Cleaning completed!");
    }

    static void wipeFloor(String room)
    {
        System.out.println("Wiping the "+room+" now!");
    }

    static void changeStatus(boolean status)
    {
        if(status)
        {
            System.out.println("Shutting down..");
        }
        else
        {
            System.out.println("Powering on..");
        }
    }

    static int displayMenu()
    {
        System.out.println("Pick one : 1. Clean\n2. Wipe\n3. Switch on\n4. Exit");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        return choice;
    }

    public static void main(String[] args) {
        int userChoice = displayMenu();
        switch (userChoice)
        {
            case 1 : cleanFloor("Bedroom");
                showAlert();
                changeStatus(true);
                break;
            case 2 : wipeFloor("Hall");
                showAlert();
                changeStatus(true);
                break;
            case 3 : changeStatus(false);
                break;
            default: System.out.println("Thank you for using! Have a good day!");
        }
    }
}

/*
1. Clean the floor
2. Alert for an obstacle
3. Wipe the floor
4. Turn on/off
5. Display the Menu
*/
