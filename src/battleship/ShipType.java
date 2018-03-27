package battleship;

public class ShipType {
    private String name;
    private final int size;

    public ShipType(int size) {
        this.size = size;
    }

    public ShipType(String name, int size) {
        this.name = name;
        this.size = size;
    }

    
    
    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
    
    
}
