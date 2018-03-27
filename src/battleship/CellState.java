package battleship;

public enum CellState {
    UNKNOW, NOTHING, SUNK;

    public static CellState getNOTHING() {
        return NOTHING;
    }

    public static CellState getSUNK() {
        return SUNK;
    }

    public static CellState getUNKNOW() {
        return UNKNOW;
    }

    
    
}
