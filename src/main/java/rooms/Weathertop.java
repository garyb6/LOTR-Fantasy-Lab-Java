package rooms;
import enemies.Enemy;
import enemies.Ringwraith;
import java.util.ArrayList;

public class Weathertop extends Room {

    Ringwraith ringwraith = new Ringwraith("Khamûl", 50, 10 );

    private ArrayList<Enemy> enemies;

    public Weathertop() {
        this.enemies = new ArrayList<>();
        this.enemies.add(ringwraith);
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }
}
