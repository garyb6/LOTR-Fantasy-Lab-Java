package players.healers;

import behaviours.IHeal;
import players.Player;
import players.healers.remedies.Kingsfoil;

public class Noldor extends Player implements IHeal {

    IHeal remedy;
    public Noldor(double hp, String name, IHeal remedy) {
        super(hp, name);
        this.remedy = remedy;
    }

    public IHeal getItem(){
        return this.remedy;
    }

    public void setItem(IHeal remedy) {
        this.remedy = remedy;
    }

    @Override
    public void changeRemedy(IHeal remedy) {
        setItem(remedy);
    }

    @Override
    public void healPlayer(Player player) {

    }

    @Override
    public int getRecover() {
        return 0;
    }
}