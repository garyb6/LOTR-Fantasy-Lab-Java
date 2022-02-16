package behaviours;

import players.Player;

public interface IHeal {

    public void changeRemedy(IHeal remedy);

    public void healPlayer(Player player);

    public int getRecover();
}
