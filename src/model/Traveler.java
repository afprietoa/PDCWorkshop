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
public class Traveler {
    private String name;
    private double weight;
    private int id;

    public Traveler(){
        this.name = "";
        this.weight = 0;
        this.id= 0;
    }

    public Traveler(int id, String name,double weight) {
        this.name = name;
        this.weight = weight;
        this.id = id;
    }


    
    public Traveler(Traveler t) {
        this.name = t.name;
        this.weight = t.weight;
        this.id = t.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    @Override
    public String toString() {
        return id + " " + name + " " + weight;
    }
    
    public void input(){
        Scanner scannStr = new Scanner(System.in);
        Scanner scannInt = new Scanner(System.in);
        Scanner scannDbl = new Scanner(System.in);
                
        System.out.println("Enter Traveler:");
        System.out.print("traveler id: ");
        id = scannInt.nextInt();
        System.out.print("name: ");
        name = scannStr.nextLine();
        System.out.print("weight: ");
        weight = scannDbl.nextDouble();

    }
    
}
