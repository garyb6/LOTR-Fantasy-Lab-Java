package players.istari.spells;

public abstract class Spells {

    private int spellPower;

    public Spells(int spellPower) {
        this.spellPower = spellPower;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }
}
