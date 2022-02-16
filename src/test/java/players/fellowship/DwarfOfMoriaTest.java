package players.fellowship;

import behaviours.IEquip;
import org.junit.Before;
import org.junit.Test;
import players.fellowship.weapons.Axe;

import static org.junit.Assert.*;

public class DwarfOfMoriaTest {

DwarfOfMoria dwarf;
Axe axe;
Axe axe2;

    @Before
    public void setUp() {
        axe = new Axe(5, 10);
        axe2 = new Axe(10, 20);
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
}