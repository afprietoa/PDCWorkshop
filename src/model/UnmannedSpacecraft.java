/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import view.Menu;

/**
 *
 * @author afprietoa
 */
public class UnmannedSpacecraft extends SpaceShip implements IOperable {
    private String researchPhenomenon;
    private static List<Load> loads; 

    public UnmannedSpacecraft () {
        super();
        this.researchPhenomenon = "none";
        loads = new ArrayList<Load>();
    }

    public UnmannedSpacecraft(String researchPhenomenon) {
        this.researchPhenomenon = researchPhenomenon;
        loads = new ArrayList<Load>();
    }

    public UnmannedSpacecraft(String researchPhenomenon, String name, int capacity, String propellant, double weight, double height, int thrust, int speed, LaunchDate launchDate, String identifier) {
        super(name, capacity, propellant, weight, height, thrust, speed, launchDate, identifier);
        this.researchPhenomenon = researchPhenomenon;
        loads = new ArrayList<Load>();
    }

    public void crudLoad( ) {
         
          int ch;  
        Scanner scanInt = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);
        do{
            Menu.LoadMenu();
            
            ch = Menu.getMenuOption();
            
            switch(ch){
                case 1:
                    System.out.print("Enter id : ");
                    int id = scanInt.nextInt();
                    
                    
                    System.out.print("Enter name: ");
                    String name = scanStr.nextLine();
                    
                    
                    System.out.print("Enter weight: ");
                    double weight = scanInt.nextDouble();
                    
                    
                    loads.add(new Load(id, name, weight));
                    System.out.println(loads);
                break;
                case 2:
                    System.out.println("+----------------------------------+");
                    Iterator<Load> i = loads.iterator();
                    while(i.hasNext()){
                        Load l = i.next();
                        System.out.println(l);
                    }
                    System.out.println("+----------------------------------+");
                break;
                case 3:
                    boolean found = false;
                    System.out.print("Enter load id to search: ");
                    id = scanInt.nextInt();
                    System.out.println("+----------------------------------+");
                    i = loads.iterator();
                    while(i.hasNext()){
                        Load l = i.next();
                        if(l.getId() == id){
                            System.out.println(l);
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
                    System.out.print("Enter load id to delete: ");
                    id = scanInt.nextInt();
                    System.out.println("+----------------------------------+");
                    i = loads.iterator();
                    while(i.hasNext()){
                        Load l = i.next();
                        if(l.getId() == id){
                            i.remove();
                            System.out.println(l);
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
                    System.out.print("Enter load id to update: ");
                    id = scanInt.nextInt();
                    System.out.println("+----------------------------------+");
                    ListIterator<Load> li = loads.listIterator();
                    while(li.hasNext()){
                        Load l = li.next();
                        if(l.getId() == id){
                            System.out.print("Enter new name: ");
                            name = scanStr.nextLine();
                            
                            System.out.print("Enter new weight: ");
                            weight = scanInt.nextInt();
                            li.set(new Load(id, name, weight));
                            
                            
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
    
    public void input(){
        Scanner scannStr = new Scanner(System.in);
        System.out.println("Unmanned Spacecraft");
        //Get spaceship input
        super.input();
        System.out.print("research phenomenon: ");
        researchPhenomenon = scannStr.nextLine();
        System.out.print("Enter loads: ");
        crudLoad( );
    }
    
    public void print(){
        System.out.println("Unmanned Spacecraft");
        super.print();
        System.out.println("research phenomenon" + researchPhenomenon);
    }


    public void exploreUniverse(String researchPhenomenon, Location destination){
        System.out.println("the research about " + researchPhenomenon + " will be done on" + destination );
    }
    
    public void transportCargo(Load load, Location destination){
        System.out.println(load.getName() +"transports to" + destination);
    }
    
    public void actSatelites(String name){
        System.out.println( name +" satellite is used for" + "comunication");
    }
           
    @Override
    public String toString() {
        return " communications satellite";
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
