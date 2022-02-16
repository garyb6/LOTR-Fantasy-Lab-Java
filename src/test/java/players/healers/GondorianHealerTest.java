package players.healers;

import org.junit.Before;
import org.junit.Test;
import players.healers.remedies.Kingsfoil;
import players.healers.remedies.Pint;

import static org.junit.Assert.*;

public class GondorianHealerTest {
    GondorianHealer gondorianHealer;
    Kingsfoil kingsfoil;
    Pint pint;

    @Before
    public void setUp() {
        kingsfoil = new Kingsfoil();
        pint = new Pint();
        gondorianHealer = new GondorianHealer(25, "Faramir", kingsfoil);
    }

    @Test
    public void canHealPlayer(){
        gondorianHealer.healPlayer(gondorianHealer);
        assertEquals(40, gondorianHealer.getHp(), 0.00);
    }

    @Test
    public void canSwitchRemedies(){
        gondorianHealer.changeRemedy(pint);
        assertEquals(pint, gondorianHealer.getItem());
    }



}