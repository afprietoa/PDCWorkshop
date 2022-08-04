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
    private Load shipLoad;

    public LaunchVehicle() {
        super();
        this.shipLoad = new Load();
    }

    public LaunchVehicle(Load shipLoad) {
        this.shipLoad = shipLoad;
    }

    public LaunchVehicle(Load shipLoad, String name, int capacity, String propellant, double weight, double height, int thrust, int speed, LaunchDate launchDate, String identifier) {
        super(name, capacity, propellant, weight, height, thrust, speed, launchDate, identifier);
        this.shipLoad = shipLoad;
    }
    
    
    public void input(){
        
        System.out.println("Launch Vehicle");
        //Get spaceship input
        super.input();
        shipLoad.input();
    }
    
    public void print(){
        System.out.println("Launch vehicle");
        super.print();
        System.out.println("Spaceship load :" + shipLoad);
    }

    public void transportCargo(Load load, Location destination){
        System.out.println(load.getName() +"transports to" + destination);
    }
    
    @Override
    public String toString() {
        return "Launch vehicle";
    }

    @Override
    public void launch(Location current) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void land(Location destination) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isOnLoad(Load l) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void load(Load l) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void unLoad(Load l) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
