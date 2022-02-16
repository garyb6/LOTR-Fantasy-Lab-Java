package players.healers.remedies;

import behaviours.IHeal;
import players.Player;

public class Pint implements IHeal {


    private int recover;


    public Pint() {
        recover = 5;
    }

    @Override
    public void changeRemedy(IHeal remedy) {

    }

    @Override
    public void healPlayer(Player player) {

    }

    public int getRecover() {
        return recover;
    }
}
