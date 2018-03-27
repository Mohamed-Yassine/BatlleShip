package battleship;

public class BattleModel {
    public enum State {
        CONFIGURE, PLAYING, DONE;
    }
    
    private final int size;
    private final FriendGrid friend;
    private final EnnemiGrid enemi;

    public BattleModel(int size) {
        this.size = size;
        this.friend = new FriendGrid();
        this.enemi = new EnnemiGrid();
    }
    
    void createShip(Ship ship) {
        friend.createShip(ship);
    }
    
    FireResult fire(int x, int y) {
       enemi.
    }
}
