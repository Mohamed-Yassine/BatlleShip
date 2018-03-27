package battleship;

public enum FireResult {
    WATER, TOUCH, SUNK;

    public static FireResult getSUNK() {
        return SUNK;
    }

    public static FireResult getTOUCH() {
        return TOUCH;
    }

    public static FireResult getWATER() {
        return WATER;
    }
    
    
}
