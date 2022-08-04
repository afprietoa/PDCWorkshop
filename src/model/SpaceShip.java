/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Scanner;
import view.Menu;




/**
 *
 * @author afprietoa
 */
public abstract class SpaceShip implements IControlable {
    private String name;
    private int capacity;
    private String propellant;
    private double weight;
    private double height;
    private int thrust;
    private int speed;
    private static Location current;
    private static Location destination;
    private LaunchDate launchDate;
    private String identifier;
    
    public SpaceShip() {
        this.name = "none";
        this.capacity = 0;
        this.propellant = "none";
        this.weight = 0;
        this.height = 0;
        this.thrust = 0;
        this.speed = 0;
        this.current = Location.EARTH;
        this.destination = Location.EARTH;
        this.launchDate = new LaunchDate();
        this.identifier = "none";
    }

    public SpaceShip(String name, int capacity, String propellant, double weight, double height, int thrust, int speed, LaunchDate launchDate, String identifier) {
        this.name = name;
        this.capacity = capacity;
        this.propellant = propellant;
        this.weight = weight;
        this.height = height;
        this.thrust = thrust;
        this.speed = speed;
        this.launchDate = new LaunchDate(launchDate);
        this.identifier = identifier;
    }


    @Override
    public abstract String toString();
    
    /**
     * It requests values by console.<br>
     * <b>post: </b> values requested from the console are what initialize the class state.
     */
    public void input(){
        Scanner scannStr = new Scanner(System.in);
        Scanner scannInt = new Scanner(System.in);
        Scanner scannDbl = new Scanner(System.in);
        
        System.out.println("Enter Spaceship");
        System.out.print("Ship name: ");
        name = scannStr.nextLine();
        System.out.print("Capacity: ");
        capacity = scannInt.nextInt();
        System.out.print("Propellant: ");
        propellant = scannStr.nextLine();
        System.out.print("Height: ");
        height = scannDbl.nextDouble();
        System.out.print("Weight: ");
        weight = scannDbl.nextDouble();
        System.out.print("Thrust: ");
        thrust = scannInt.nextInt();
        System.out.print("Speed: ");
        speed = scannInt.nextInt();
        System.out.println("Current location: ");
        current = locate();
        System.out.println("Destination location: ");
        destination = locate();
        launchDate.input();
        System.out.print("Identifier: ");
        identifier = scannStr.nextLine();
    }    
    
    public Location locate(){
        int op = 0;
        System.out.println("Planet Orbit or Planet's Atmosphere");
        System.out.println("  1-Earth,  2-Jupiter, 3-Mercury");
        System.out.println("  4-Uranus, 5-Neptuno, 6-Venus");
        System.out.println("  7-Saturn, 8-Mars,    9-Moon");
        op = Menu.getMenuOption();
        
        Location loc;
        
        switch(op){
            case 1: // earth
                loc = Location.EARTH;
            break;
            case 2: // jupiter
                loc = Location.JUPITER;
            break;
            case 3: //mars
                loc = Location.MARS;
            break;
            case 4: //mercury
                loc = Location.MERCURY;
            break;
            case 5: //moon
                loc = Location.MOON;
            break;
            case 6: //neptuno
                loc = Location.NEPTUNO;
            break;
            case 7: //saturn
                loc = Location.SATURN;
            break;
            case 8: //uranus
                loc = Location.URANUS;
            break;
            case 9: //venus
                loc = Location.VENUS;
            break;
            default:
                loc = Location.EARTH;
            break;
        }
        
        return loc;

    }
    
    /**
     * It prints all values of the class <br>
     * <b>post: </b>  each value that defines the class state is printed by the console. 
     */
    public void print(){
        System.out.println("Spaceship details:");
        System.out.println("Ship name :" + name);
        System.out.println("Current :" + current);
        System.out.println("Destiny :" + destination);
        System.out.println("Launch date :" + launchDate);
        System.out.println("identifier :" + identifier);
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getPropellant() {
        return propellant;
    }


    public int getThrust() {
        return thrust;
    }

    
    
}
