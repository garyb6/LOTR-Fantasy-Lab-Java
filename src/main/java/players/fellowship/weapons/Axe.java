package players.fellowship.weapons;

public class Axe extends Weapon {
    private String type;

    public Axe(int minPower, int maxPower) {
        super(minPower, maxPower);
        this.type = "Axe";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
