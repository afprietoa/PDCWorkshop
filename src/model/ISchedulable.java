/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

/**
 *<h1>ISchedulable<h1>
 * interface, it defines three abstract methods.
 * it is also responsible of delegate the implementation of schedule methods.
 * @author afprietoa
 */
public interface ISchedulable {
   /**
   * validation abstract method<br>
   */
    public abstract boolean isOnBoard(Traveler t);
   /**
   * board abstract method<br>
   */
    public abstract void board(Traveler t);
   /**
   * leave abstract method<br>
   */
    public abstract void leave(Traveler t);
}
