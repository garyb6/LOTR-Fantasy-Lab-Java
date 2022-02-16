package quest;
import enemies.Ringwraith;
import players.Player;
import players.fellowship.DwarfOfMoria;
import players.fellowship.SilvanElf;
import players.fellowship.weapons.Axe;
import players.fellowship.weapons.Bow;
import rooms.Room;
import rooms.Weathertop;
import java.util.ArrayList;

public class Quest {
    private ArrayList<Room> levels;
    private ArrayList<Player> players;
    private Room currentRoom;

    private Axe axe = new Axe(5, 15);
    private Bow bow = new Bow(8, 12);
    private DwarfOfMoria dwarf = new DwarfOfMoria(50, "Gimli", axe);
    private SilvanElf elf = new SilvanElf(100, "Legolas", bow);
//    Ringwraith ringwraith = new Ringwraith(5, "Khamûl")


//    private Weathertop weathertop = new Weathertop(ArrayList<Ringwraith>, );

    public Quest(ArrayList<Room> levels, ArrayList<Player> players, Room currentRoom) {
        this.levels = levels;
        this.players = new ArrayList<>();
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
}
