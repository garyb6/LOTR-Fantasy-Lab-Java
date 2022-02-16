package players.fellowship;
import players.Player;
import players.fellowship.weapons.Weapon;


public class DwarfOfMoria extends Player {

    private Weapon weapon;

    public DwarfOfMoria(double hp, String name, Weapon weapon) {
        super(hp, name);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void equip(Weapon weapon) {
        setWeapon(weapon);
    }
}
