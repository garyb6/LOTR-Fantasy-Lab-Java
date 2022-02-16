package quest;
import players.Player;
import rooms.Room;
import java.util.ArrayList;

public class Quest {
    private ArrayList<Room> levels;
    private ArrayList<Player> players;

    public Quest(ArrayList<Room> levels, ArrayList<Player> players) {
        this.levels = levels;
        this.players = new ArrayList<>();
    }
}
