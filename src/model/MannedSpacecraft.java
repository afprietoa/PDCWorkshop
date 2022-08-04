/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import view.Menu;

/**
 *
 * @author afprietoa
 */
public class MannedSpacecraft extends SpaceShip implements ISchedulable {
    
    //-----------------------------------------------------------------
    // Attributes
    //-----------------------------------------------------------------
    
   /**
    * number of travelers
    */
     private int numTravelers;
   /**
    * spaceship travelers list
    */
     private static List<Traveler> travelers; 

     
    //-----------------------------------------------------------------
    // Constructor
    //------------------------------------------------------------------
    
    /**
     * It initializes the defaults values. <br>
     */
    public MannedSpacecraft () {
        super();
        this.numTravelers = 0;
        travelers= new ArrayList<Traveler>();
    }

    public MannedSpacecraft(int numTravelers) {
        this.numTravelers = numTravelers;
        travelers= new ArrayList<Traveler>();
    }
    
     /**
     * It initializes the data of the class with the values that come by parameter. <br>
     * @param shipLoap day number
     * @param name name of spaceship
     * @param capacity weight capacity spaceship
     * @param propellant fuel which is burned with an oxidizer
     * @param weight weight of spaceship
     * @param height height of spaceship
     * @param thrust thrust due to fuel
     * @param speed speed that reaches the spaceship
     * @param launchDate launch date of spaceship
     * @param identifier unique identifier of spaceship
     * @param travelers list of travelers carried by   spaceship
     */
    public MannedSpacecraft(int numTravelers, String name, int capacity, String propellant, double weight, double height, int thrust, int speed, LaunchDate launchDate, String identifier) {
        super(name, capacity, propellant, weight, height, thrust, speed, launchDate, identifier);
        this.numTravelers = numTravelers;
        travelers= new ArrayList<Traveler>();
    }
    
    /**
     * CRUD of collection of travelers <br>
     * <b>post: </b>  all operations of CRUD are applied to list of travelers. 
     */
    public void crudTraveler( ) {
         
          int ch;  
        Scanner scanInt = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);
        do{
            Menu.TravelerMenu();
            
            ch = Menu.getMenuOption();
            
            switch(ch){
                case 1:
                    System.out.print("Enter id : ");
                    int id = scanInt.nextInt();
                    
                    
                    System.out.print("Enter name: ");
                    String name = scanStr.nextLine();
                    
                    
                    System.out.print("Enter weight: ");
                    double weight = scanInt.nextDouble();
                    
                    
                    travelers.add(new Traveler(id, name, weight));
                    System.out.println(travelers);
                break;
                case 2:
                    System.out.println("+----------------------------------+");
                    Iterator<Traveler> i = travelers.iterator();
                    while(i.hasNext()){
                        Traveler t = i.next();
                        System.out.println(t);
                    }
                    System.out.println("+----------------------------------+");
                break;
                case 3:
                    boolean found = false;
                    System.out.print("Enter traveler id to search: ");
                    id = scanInt.nextInt();
                    System.out.println("+----------------------------------+");
                    i = travelers.iterator();
                    while(i.hasNext()){
                        Traveler t = i.next();
                        if(t.getId() == id){
                            System.out.println(t);
                            found = true;
                        }
                    }
                    if(!found){
                        System.out.println("Record not found");
                    }
                    System.out.println("+----------------------------------+");
                break;
                case 4:
                    found = false;
                    System.out.print("Enter traveler id to delete: ");
                    id = scanInt.nextInt();
                    System.out.println("+----------------------------------+");
                    i = travelers.iterator();
                    while(i.hasNext()){
                        Traveler t = i.next();
                        if(t.getId() == id){
                            i.remove();
                            System.out.println(t);
                            found = true;
                        }
                    }
                    if(!found){
                        System.out.println("Record not found");
                    }else{
                        System.out.println("Record is deleted successfully..!");
                    }
                   System.out.println("+----------------------------------+");
                break;
                case 5:
                    found = false;
                    System.out.print("Enter traveler id to update: ");
                    id = scanInt.nextInt();
                    System.out.println("+----------------------------------+");
                    ListIterator<Traveler> li = travelers.listIterator();
                    while(li.hasNext()){
                        Traveler t = li.next();
                        if(t.getId() == id){
                            System.out.print("Enter new name: ");
                            name = scanStr.nextLine();
                            
                            System.out.print("Enter new weight: ");
                            weight = scanInt.nextInt();
                            li.set(new Traveler(id, name, weight));
                            
                            
                            ;
                            found = true;
                        }
                    }
                    if(!found){
                        System.out.println("Record not found");
                    }else{
                        System.out.println("Record is update successfully..!");
                    }
                    System.out.println("+----------------------------------+");
                break;

            }
            
        }while(ch!=6);
    }

     /**
     * It requests values by console.<br>
     * <b>post: </b> values requested from the console are what initialize the class state.
     */    
    public void input(){
        Scanner scannInt = new Scanner(System.in);
        System.out.println("Unmanned Spacecraft");
        //Get spaceship input
        super.input();
        System.out.print("Number of travelers: ");
        numTravelers = scannInt.nextInt();
        System.out.print("Enter travelers: ");
        crudTraveler( );
    }
    
    /**
     * It prints all values of the class <br>
     * <b>post: </b>  each value that defines the class state is printed by the console. 
     */
    public void print(){
        System.out.println("Full Time Employee");
        super.print();
        System.out.print("number of travelers: " + numTravelers);
    }

  
    @Override
    public String toString() {
        return " Manned Spacecraft";
    }

    @Override
    public void launch(Location current) {
        System.out.println("launching in "+ current);
        System.out.println("The propellant "+ this.getPropellant() +" provide a trhust of"+ this.getThrust());
    }

    @Override
    public void land(Location destination) {
        System.out.println("landing in "+ destination);
    }

    @Override
    public boolean isOnBoard(Traveler t) {
        if(!travelers.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void board(Traveler t) {
        System.out.print("Traveler board "+ t.getName()+" the spaceship with a weight of" + t.getWeight());
        System.out.println("The balance of the number of travelers is " + travelers.size() );
    }

    @Override
    public void leave(Traveler t) {
        System.out.print("Traveler leave "+ t.getName()+" the spaceship with a weight of" + t.getWeight());
        System.out.println("The balance of the number of travelers is  " + travelers.size() );
    }

  
}
