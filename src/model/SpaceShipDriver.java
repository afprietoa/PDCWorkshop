/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import view.Menu;

/**
 *
 * @author afprietoa
 */
public class SpaceShipDriver {
      // spaceships 
      private SpaceShip spaceships [];
      // position that occupy the array on the spaceship
      private int spaceShipCount;
    
    public SpaceShipDriver() {
        this.spaceShipCount = 0;
        this.spaceships = new SpaceShip[100];
    }

    public SpaceShip[] getSpaceships() {
        return spaceships;
    }

    public void setSpaceships(SpaceShip[] spaceships) {
        this.spaceships = spaceships;
    }

    public int getSpaceShipCount() {
        return spaceShipCount;
    }

    public void setSpaceShipCount(int spaceShipCount) {
        this.spaceShipCount = spaceShipCount;
    }
    
       
        
     /**
     * Add a spaceship type<br>
     * <b>post: </b>  the type of spaceship is added to array according to the option entered by console. 
     */
        public void addSpaceship(SpaceShip[] e, int spaceShipCount){
        int type = 0;
        System.out.println("Enter spaceship type");
        System.out.println("1-Launch Vehicle, 2-Manned Spacecraft, 3-Unmanned Spacecraft");
        type = Menu.getMenuOption();
        
        switch(type){
            case 1: //LaunchVehicle
                e[spaceShipCount] = new LaunchVehicle();
                e[spaceShipCount].input();
                spaceShipCount++;
                
                setSpaceships(spaceships);
                setSpaceShipCount(spaceShipCount);
            break;
            case 2: //MannedSpacecraft
                e[spaceShipCount] = new MannedSpacecraft();
                e[spaceShipCount].input();
                spaceShipCount++;
                
                setSpaceships(spaceships);
                setSpaceShipCount(spaceShipCount);
            break;
            case 3: //UnmannedSpacecraft
                e[spaceShipCount] = new UnmannedSpacecraft();
                e[spaceShipCount].input();
                spaceShipCount++;

                setSpaceships(spaceships);
                setSpaceShipCount(spaceShipCount);
            break;
        }
        
    }
}
