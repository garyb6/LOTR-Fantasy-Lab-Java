package players.fellowship.weapons;

public class Bow extends Weapon{

    private String type;

    public Bow(int minPower, int maxPower) {
        super(minPower, maxPower);
        this.type = "Bow";
    }


}
