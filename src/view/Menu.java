/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;


import java.util.Collection;
import java.util.Scanner;
import model.SpaceShip;


/**
 *
 * @author afprietoa
 */
public class Menu {
    int ch;

    public Menu() {
    }

    // Create spaceship menu
    public static void mainMenu( ){

            System.out.println("+----------------------------------+");
            System.out.println("|         SPACESHIP MENU           |");
            System.out.println("+----------------------------------+");
            System.out.println("|  Options:                        |");
            System.out.println("|        1. Add new spaceship      |");
            System.out.println("|        2. Print all              |");
            System.out.println("|        3. Print given spaceship  |");
            System.out.println("|        4. Exit                   |");
            System.out.println("+----------------------------------+");
            
    }
    // Create traveler menu
     public static void TravelerMenu( ){

            System.out.println("+----------------------------------+");
            System.out.println("|          TRAVELER MENU           |");
            System.out.println("+----------------------------------+");
            System.out.println("|     Options:                     |");
            System.out.println("|            1. Insert             |");
            System.out.println("|            2. Display            |");
            System.out.println("|            3. Search             |");
            System.out.println("|            4. Delete             |");
            System.out.println("|            5. Update             |");
            System.out.println("|            6. Exit               |");
            System.out.println("+----------------------------------+");
            
    }
      // Create load menu
         public static void LoadMenu( ){

            System.out.println("+----------------------------------+");
            System.out.println("|            LOAD MENU             |");
            System.out.println("+----------------------------------+");
            System.out.println("|     Options:                     |");
            System.out.println("|            1. Insert             |");
            System.out.println("|            2. Display            |");
            System.out.println("|            3. Search             |");
            System.out.println("|            4. Delete             |");
            System.out.println("|            5. Update             |");
            System.out.println("|            6. Exit               |");
            System.out.println("+----------------------------------+");
            
    }
     // Create a method to get menu option
    // Read integer number
    public static int getMenuOption(){
        int op;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your option: ");
        op = in.nextInt();
        return op;
    } 

}
