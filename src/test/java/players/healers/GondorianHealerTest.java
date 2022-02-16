package players.healers;

import org.junit.Before;
import org.junit.Test;
import players.healers.remedies.Kingsfoil;

import static org.junit.Assert.*;

public class GondorianHealerTest {
    GondorianHealer gondorianHealer;
    Kingsfoil kingsfoil;
    @Before
    public void setUp() {
        kingsfoil = new Kingsfoil();
        gondorianHealer = new GondorianHealer(25, "Faramir", kingsfoil);
    }

    @Test
    public void canHealPlayer(){
        gondorianHealer.healPlayer(gondorianHealer);
        assertEquals(40, gondorianHealer.getHp(), 0.00);
    }



}