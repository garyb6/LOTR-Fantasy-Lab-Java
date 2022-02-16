package players.istari.spells;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FireblastTest {

    Fireblast fireblast;
    @Before
    public void setUp(){
        fireblast = new Fireblast(20);
    }

    @Test
    public void hasSpellPower(){
        assertEquals(20, fireblast.getSpellPower());
    }

    @Test
    public void changeSpellPower(){
        fireblast.setSpellPower(50);
        assertEquals(50, fireblast.getSpellPower());
    }
}