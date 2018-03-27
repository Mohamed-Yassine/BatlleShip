package battleship;

public class Ship {    
    private final ShipType type;
    private final int x;
    private final int y;    
    private final Orientation orientation;

    public Ship(ShipType type, int x, int y, Orientation orientation) {
        this.type = type;
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }
    
    public ShipType getType() {
        return type;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Orientation getOrientation() {
        return orientation;
    }
     
}
