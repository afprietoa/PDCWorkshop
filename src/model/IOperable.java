/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

/**
 *<h1>IOperable<h1>
 * interface, it defines three abstract methods.
 * it is also responsible of delegate the implementation of operation methods.
 * @author afprietoa
 */
public interface IOperable {
   /**
   * validation abstract method<br>
   */
    public abstract boolean isOnLoad(Load l);
   /**
   * load abstract method<br>
   */
    public abstract void load(Load l);
   /**
   * unload abstract method<br>
   */
    public abstract void unLoad(Load l);
}
