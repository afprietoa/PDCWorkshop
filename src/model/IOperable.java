/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

/**
 *
 * @author afprietoa
 */
public interface IOperable {
    public abstract boolean isOnLoad(Load l);
    public abstract void load(Load l);
    public abstract void unLoad(Load l);
}
