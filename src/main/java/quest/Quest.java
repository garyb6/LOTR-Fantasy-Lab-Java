package quest;
import players.Player;
import rooms.Room;
import rooms.Weathertop;
import java.util.ArrayList;

public class Quest {
    private ArrayList<Room> levels;
    private ArrayList<Player> players;
    private Room currentRoom;



    private Weathertop weathertop = new Weathertop();

    public Quest(ArrayList<Player> players) {
        this.levels = new ArrayList<>();
        levels.add(weathertop);
        this.players = players;
        this.currentRoom = levels.get(0);
    }

    public ArrayList<Room> getLevels() {
        return levels;
    }

    public void setLevels(ArrayList<Room> levels) {
        this.levels = levels;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }
}
