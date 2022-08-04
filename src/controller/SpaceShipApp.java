/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Scanner;
import model.LaunchVehicle;
import model.MannedSpacecraft;
import model.SpaceShip;
import model.SpaceShipDriver;
import model.UnmannedSpacecraft;
import view.MainView;
import view.Menu;
import view.SplashScreen;

/**
 *<h1>SpaceshipApp<h1>
 * Main class, it works as application entry point.
 * it is also responsible of communication between the view and model.
 * @author afprietoa
 */
public class SpaceShipApp {
    //-----------------------------------------------------------------
    // Attributes
    //-----------------------------------------------------------------
    
    // main view
    private MainView mainView;
    // spaceship driver
    private SpaceShipDriver spaceshipDriver;
    // spaceship app
    private static SpaceShipApp instance;
    
    //-----------------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------------
    
    /**
     * It initializes the association type relationship. <br>
     * <b>post: </b> It instantiates the association type relationship for the prototypes of the view and the model.<br>

     */
    private SpaceShipApp () {
		super();
		
		this.spaceshipDriver = new SpaceShipDriver();
		this.mainView = new MainView();
    }
    
    //-----------------------------------------------------------------
    // Methods
    //----------------------------------------------------------------- 

     /**
     * It adds a spaceship type<br>
     * <b>post: </b> a spaceship of a specific type is added due to the petition done to class that handles the model. 
     */
    public void addSpaceship(SpaceShip[] e, int spaceShipCount){
        this.spaceshipDriver.addSpaceship( e, spaceShipCount);
    }
    
    /**
     * It prints all spaceships <br>
     * <b>post: </b> all spaceships are printed due to the petition done to class that handles the view. 
     */ 
    public void printAll(SpaceShip[] e, int spaceShipCount){
        this.mainView.printAll( e, spaceShipCount);
    }
    
    /**
     * It prints a specific spaceship <br>
     * <b>post: </b> a specific spaceships is printed due to the petition done to class that handles the view. 
     */ 
    public void printGiven(SpaceShip[] e, int spaceShipCount){
        this.mainView.printGiven( e, spaceShipCount);
    }

    /**
     * It accesses to spaceships<br>
     * <b>post: </b> spaceship array is accessed due to the petition done to class that handles the model. 
     */
    public SpaceShip[] getSpaceships() {
        return this.spaceshipDriver.getSpaceships();
    }


    /**
     * It accesses to counter<br>
     * <b>post: </b> counter is accessed due to the petition done to class that handles the model. 
     */
    public int getSpaceShipCount() {
        return this.spaceshipDriver.getSpaceShipCount();
    }
     
     /**
     * It provides a unique instance <br>
     * it is designated an unique instance that is structured through singleton pattern
     * @return unique instance of controller class if the class instance does not exist.
     */
     // singleton pattern
    public static SpaceShipApp getInstance() {
		if ( instance == null ) {
			instance = new SpaceShipApp();
		}
		
		return instance;
    }
    
     /**
     * It runs main app<br>
     * <b>post: </b> main thread runs through run method. 
     */
    private void run() throws InterruptedException {
        // Main loop
        // spaceships 
        SpaceShip spaceships [] = new SpaceShip[100];
        // position that occupy the array on the spaceship
        int spaceShipCount = 0;
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
                    addSpaceship(getSpaceships(),getSpaceShipCount());
                    
                break;
                case 2: //Print
                    System.out.println("Print all");
                    printAll(getSpaceships(),getSpaceShipCount());
                break;
                case 3: // Print given
                    System.out.println("Prin given");
                    printGiven(getSpaceships(),getSpaceShipCount());
                break;
                case 4:
                    System.out.println("Thanks");
                break;
                default:
                    System.out.println("Error input");
                
                 
            }
        }while(op != 4);
    }
    
    

       
    public static void main(String[] args) throws InterruptedException {
        
       SpaceShipApp app = SpaceShipApp.getInstance();
       app.run();
    }
}
