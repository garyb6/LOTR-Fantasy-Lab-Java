package players.healers.remedies;

import behaviours.IHeal;
import players.Player;

public class Kingsfoil implements IHeal {

    private int recover;


    public Kingsfoil() {
        recover = 15;
    }

    @Override
    public void changeRemedy() {

    }

    @Override
    public void healPlayer(Player player) {

    }

    public int getRecover() {
        return recover;
    }
}
