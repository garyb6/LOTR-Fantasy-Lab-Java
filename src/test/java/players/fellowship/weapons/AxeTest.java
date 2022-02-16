package players.fellowship.weapons;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AxeTest {

    Axe axe;

    @Before
    public void setUp() throws Exception {
        axe = new Axe(5, 10);
    }

    @Test
    public void canGetType() {
        assertEquals("Axe", axe.getType());
    }

}