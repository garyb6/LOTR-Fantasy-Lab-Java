package behaviours;

import players.Player;

public interface IHeal {

    public void changeRemedy();

    public void healPlayer(Player player);

    public int getRecover();
}
