/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

import java.util.Scanner;

/**
 *
 * @author afprietoa
 */
public class Load {
    private String name;
    private double weight;
    private int id;

    public Load() {
        this.name = "";
        this.weight = 0;
        this.id = 0;
    }

    public Load(int id, String name, double weight) {
        this.name = name;
        this.weight = weight;
        this.id = id;
    }

    
    public Load(Load l) {
        this.name = l.name;
        this.weight = l.weight;
        this.id = l.id;
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

    public String getName() {
        return name;
    }
    
     /**
     * It requests values by console.<br>
     * <b>post: </b> values requested from the console are what initialize the class state.
     */
    public void input(){
        Scanner scannStr = new Scanner(System.in);
        Scanner scannInt = new Scanner(System.in);
        Scanner scannDbl = new Scanner(System.in);
        
        System.out.println("Enter Load:");
        System.out.print("load id: ");
        id = scannInt.nextInt();
        System.out.print("name: ");
        name = scannStr.nextLine();
        System.out.print("weight: ");
        weight = scannDbl.nextDouble();

    } 
}
