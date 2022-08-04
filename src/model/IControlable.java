/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;


/**
 *<h1>IControlable<h1>
 * interface, it defines two abstract methods.
 * it is also responsible of delegate the implementation of control methods.
 * @author afprietoa
 */
public interface IControlable {
   /**
   * launch abstract method<br>
   */
    public abstract void launch(Location current);
   /**
   * land abstract method<br>
   */
    public abstract void land(Location destination);

}
