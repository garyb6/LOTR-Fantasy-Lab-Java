package players.healers;

import behaviours.IHeal;
import players.Player;

public class GondorianHealer extends Player implements IHeal {

    IHeal remedy;
    public GondorianHealer(double hp, String name, IHeal remedy) {
        super(hp, name);
        this.remedy = remedy;
    }

    public IHeal getItem() {
        return remedy;
    }

    public void setItem(IHeal remedy) {
        this.remedy = remedy;
    }

    @Override
    public void healPlayer(Player player) {
        double hp = player.getHp();
        player.setHp(hp += this.remedy.getRecover());

    }

    public int getRecover() {
        return 0;
    }

    @Override
    public void changeRemedy(IHeal remedy) {
        setItem(remedy);

    }
}
