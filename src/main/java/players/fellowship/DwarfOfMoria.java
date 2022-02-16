package players.fellowship;
import behaviours.IEquip;
import players.Player;



public class DwarfOfMoria extends Player implements IEquip {

    private IEquip weapon;

    public DwarfOfMoria(double hp, String name, IEquip weapon) {
        super(hp, name);
        this.weapon = weapon;

    }

    public IEquip getWeapon() {
        return weapon;
    }

    public void setWeapon(IEquip weapon) {
        this.weapon = weapon;
    }

    public void equip(IEquip weapon) {
        setWeapon(weapon);
    }
}
