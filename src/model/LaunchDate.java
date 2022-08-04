/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Scanner;

/**
 *<h1>LaunchDate<h1>
 * this class represents a launch date.
 * @author afprietoa
 */
public class LaunchDate {
    //-----------------------------------------------------------------
    // Attributes
    //-----------------------------------------------------------------
    
   /**
    * day number
    */
    private int day;
    /**
    * month number
    */
    private int mon;
    /**
    * year number
    */
    private int year;
    //-----------------------------------------------------------------
    // Constructor
    //------------------------------------------------------------------
    
    /**
     * It initializes the defaults values to zero. <br>
     */
    
    public LaunchDate(){
        this.day = 0;
        this.mon = 0;
        this.year = 0;
    }
    
    /**
     * It initializes the data of the class with the values that come by parameter. <br>
     * @param day day number
     * @param mon month number
     * @param year year number
     */
    public LaunchDate(int day, int mon, int year) {
        this.day = day;
        this.mon = mon;
        this.year = year;
    }
    
     /**
     * It initializes the data of the class with that object that come by parameter <br>
     */
    public LaunchDate(LaunchDate d) {
        this.day = d.day;
        this.mon = d.mon;
        this.year = d.year;
    }    
    

    /**
     * It devolves the printed values by console.
     * @return values of launch date printed in console.
     */
    @Override
    public String toString() {
        return year +"."+ mon+"."+day;
    }
     
    /**
     * It requests values by console.<br>
     * <b>post: </b> values requested from the console are what initialize the class state.
     */
    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Launch date:");
        System.out.print("Year: ");
        year = in.nextInt();
        System.out.print("Month: ");
        mon = in.nextInt();
        System.out.print("Day: ");
        day = in.nextInt();
    }
    
    
}
