package players.fellowship;

import org.junit.Before;
import org.junit.Test;
import players.fellowship.weapons.Axe;
import players.fellowship.weapons.Bow;

import static org.junit.Assert.*;

public class DwarfOfMoriaTest {

DwarfOfMoria dwarf;
Axe axe;
Bow bow;

    @Before
    public void setUp() {
        axe = new Axe(5, 15);
        bow = new Bow(8, 12);
        dwarf = new DwarfOfMoria(50, "Gimli", axe);
    }

    @Test
    public void dwarfHasAxe(){
        assertNotNull(dwarf.getWeapon());
    }

    @Test
    public void dwarfAxeHasMaxPower(){
        assertEquals(10, dwarf.getWeapon().getMaxPower());
    }

    @Test
    public void dwarfCanChangeWeapon(){
        dwarf.equip(bow);
        assertNotSame(axe, dwarf.getWeapon());
    }
}