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
public class GameMap {
    private final static int MAX_COLUMNS = 9, MAX_ROWS = 9;
    public static Entity[][] player1Map = new Entity[MAX_ROWS][MAX_COLUMNS];
    public static Entity[][] player2Map = new Entity[MAX_ROWS][MAX_COLUMNS];
    public static Entity[][] player2MapHidden = new Entity[MAX_ROWS][MAX_COLUMNS];
    
    public GameMap() {
        int rowCount = 1;
        for (int i = 0; i < MAX_COLUMNS; i++) {
            for (int j = 0; j < MAX_ROWS; j++) {
                if (j == 0 && i == 0) {continue;}
                else if (i == 0) {
                    player1Map[j][i] = rowCount;
                    rowCount++;
                }
            }
        }
    }
    
    
}
