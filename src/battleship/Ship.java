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
public abstract class Ship extends Entity {
    public String name;
    public boolean isHit = false;
    
    public Ship() {
        super('#');
    }
    
    public void hitShip(int row, int col) {
        
    }
    
    public void createShip(int row1, int col1, int row2, int col2) {
        if (col1 - col2 == 0) {
            for (int i = 0; i < Math.abs(row1 - row2); i++) {
                if (player1Map[i+1][col1].symbol == '#')
            }
        } 
    }
}
