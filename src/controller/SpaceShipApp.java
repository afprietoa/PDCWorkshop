/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Scanner;
import model.LaunchVehicle;
import model.MannedSpacecraft;
import model.SpaceShip;
import model.UnmannedSpacecraft;
import view.Menu;
import view.SplashScreen;

/**
 *
 * @author afprietoa
 */
public class SpaceShipApp {
    // Add employee array
   static SpaceShip e [] = new SpaceShip[100];
   static int spaceShipCount;
    



    
    //Now add methods to the min and create app
    public static void addSpaceship(){
        int type = 0;
        System.out.println("Enter spaceship type");
        System.out.println("1-Launch Vehicle, 2-Manned Spacecraft, 3-Unmanned Spacecraft");
        type = Menu.getMenuOption();
        
        switch(type){
            case 1: //LaunchVehicle
                e[spaceShipCount] = new LaunchVehicle();
                e[spaceShipCount].input();
                spaceShipCount++;
            break;
            case 2: //MannedSpacecraft
                e[spaceShipCount] = new MannedSpacecraft();
                e[spaceShipCount].input();
                spaceShipCount++;
            break;
            case 3: //UnmannedSpacecraft
                e[spaceShipCount] = new UnmannedSpacecraft();
                e[spaceShipCount].input();
                spaceShipCount++;
            break;
        }
    }
    
    //Create a method to print all
    public static void printAll(){
        for(int i=0; i<spaceShipCount; i++){
            e[i].print();
        }
    }
    
    public static void printGiven(){
        //Given identifier
        String identifier;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter identifier: ");
        identifier = in.nextLine();
        for(int i=0; i<spaceShipCount; i++){
            if(identifier.equals(e[i].getIdentifier())){
                System.out.println("***Given spaceship***");
                e[i].print();
            }
        }
    }
    
    public static void main(String[] args) throws InterruptedException {

    // Main loop
        spaceShipCount = 0;
        int op=0;

        // Print splash screen
        SplashScreen.animateScreen();
        do{
            
            // Print menu         
            Menu.mainMenu();
            // Get menu option
            op=Menu.getMenuOption();
            
            //Now add switch here
            switch(op){
                case 1: //Add
                    System.out.println("Add");
                    addSpaceship();
                break;
                case 2: //Print
                    System.out.println("Print all");
                    printAll();
                break;
                case 3: // Print given
                    System.out.println("Prin given");
                    printGiven();
                break;
                case 4:
                    System.out.println("Thanks");
                break;
                default:
                    System.out.println("Error input");
                
                 
            }
        }while(op != 4);
        
        
    }
}
