package quest;
import org.junit.Before;
import org.junit.Test;
import players.Player;
import players.fellowship.DwarfOfMoria;
import players.fellowship.SilvanElf;
import players.fellowship.weapons.Axe;
import players.fellowship.weapons.Bow;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class QuestTest {

    Quest quest;

    @Before
    public void setUp() {
        Axe axe = new Axe(5, 15);
        Bow bow = new Bow(8, 12);
        DwarfOfMoria dwarf = new DwarfOfMoria(50, "Gimli", axe);
        SilvanElf elf = new SilvanElf(100, "Legolas", bow);
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(dwarf);
        players.add(elf);
        quest = new Quest(players);
    }

    @Test
    public void canGetCurrentRoom() {
        assertNotNull(quest.getCurrentRoom());
    }
}