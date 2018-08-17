/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

/**
 *
 * @author Jonathan
 */
public abstract class Entity {
    protected int row, col;
    protected char symbol;
    
    public Entity(char symbol) {
        this.symbol = symbol;
    }
    
    public void assignMarker(int row, int col) {};
}
