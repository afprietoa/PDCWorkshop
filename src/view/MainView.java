/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.SpaceShipApp;
import java.util.Scanner;
import model.SpaceShip;

/**
 *<h1>MainView<h1>
 * Class represents the main view.
 * it is also responsible for the creation and visualization of the different types of spaceships.
 * @author afprietoa
 */
public class MainView {
    
    
     /**
     * Print all spaceships <br>
     * <b>post: </b>  each spaceship is printed in each traveled for loop. 
     */
    //Create a method to print all
    public void printAll(SpaceShip[] e, int spaceShipCount){
        for(int i=0; i<spaceShipCount; i++){
            e[i].print();
        }
    }
    
     /**
     * Print specific spaceship <br>
     * <b>post: </b>  spaceship is printed according to the identifier entered by console. 
     */
    public void printGiven(SpaceShip[] e, int spaceShipCount){
        //Given identifier
        String identifier;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter identifier: ");
        identifier = in.nextLine();
        for(int i=0; i< spaceShipCount; i++){
            if(identifier.equals(e[i].getIdentifier())){
                System.out.println("***Given spaceship***");
                e[i].print();
            }
        }
    }
    
}
