/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Scanner;

/**
 *
 * @author afprietoa
 */
public class LaunchVehicle extends SpaceShip implements IOperable {
    
    //-----------------------------------------------------------------
    // Attributes
    //-----------------------------------------------------------------
    
   /**
    * load that launch the spaceship
    */
    private Load shipLoad;
    
    //-----------------------------------------------------------------
    // Constructor
    //------------------------------------------------------------------
    
    /**
     * It initializes the defaults values. <br>
     */
    public LaunchVehicle() {
        super();
        this.shipLoad = new Load();
    }

    public LaunchVehicle(Load shipLoad) {
        this.shipLoad = shipLoad;
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
     * @param shipLoad ship load carried by the spaceship
     */
    public LaunchVehicle(Load shipLoad, String name, int capacity, String propellant, double weight, double height, int thrust, int speed, LaunchDate launchDate, String identifier) {
        super(name, capacity, propellant, weight, height, thrust, speed, launchDate, identifier);
        this.shipLoad = shipLoad;
    }
    
     /**
     * It requests values by console.<br>
     * <b>post: </b> values requested from the console are what initialize the class state.
     */
    public void input(){
        
        System.out.println("Launch Vehicle");
        //Get spaceship input
        super.input();
        shipLoad.input();
    }
    
     /**
     * It prints all values of the class <br>
     * <b>post: </b>  each value that defines the class state is printed by the console. 
     */
    public void print(){
        System.out.println("Launch vehicle");
        super.print();
        System.out.println("Spaceship load :" + shipLoad);
    }

    public void LaunchCargo(Load load, Location destination){
        System.out.println(load.getName() +"launch to" + destination);
    }
    
    
    @Override
    public String toString() {
        return "Launch Vehicle";
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
    public boolean isOnLoad(Load l) {
        if(l != null){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void load(Load l) {
        System.out.print("loading a wieght of:" + l.getWeight());
    }

    @Override
    public void unLoad(Load l) {
        System.out.print("unloading a wieght of:" + l.getWeight());
    }
    
    
}
