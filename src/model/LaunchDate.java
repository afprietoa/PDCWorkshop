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
public class LaunchDate {
    private int day;
    private int mon;
    private int year;
    
    public LaunchDate(){
        this.day = 0;
        this.mon = 0;
        this.year = 0;
    }

    public LaunchDate(int day, int mon, int year) {
        this.day = day;
        this.mon = mon;
        this.year = year;
    }
    
    public LaunchDate(LaunchDate d) {
        this.day = d.day;
        this.mon = d.mon;
        this.year = d.year;
    }    
    
    public void LaunchCargo(Load load, Location destination){
        System.out.println(load.getName() +"launch to" + destination);
    }
    
    @Override
    public String toString() {
        return year +"."+ mon+"."+day;
    }
    
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
