package battleship;

import java.util.ArrayList;

public class BattleGrid {
    private int size;
    private ArrayList<Ship> ships;
    private ArrayList<Bomb> bombs;

   /* 
    CellState[][] getCellStates() {
        
    }
*/

    public int getSize() {
        return size;
    }
    
    
    public ArrayList<Bomb> getBombs() {
        return bombs;
    }

    public ArrayList<Ship> getShips() {
        return ships;
    }   
    
    FireResult fire(int x, int y) {
        Bomb bomb = new Bomb(x, y);
        
    }
}
