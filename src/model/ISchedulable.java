/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

/**
 *
 * @author afprietoa
 */
public interface ISchedulable {
    public abstract boolean isOnBoard(Traveler t);
    public abstract void board(Traveler t);
    public abstract void leave(Traveler t);
}
