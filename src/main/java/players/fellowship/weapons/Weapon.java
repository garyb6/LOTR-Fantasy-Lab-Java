package players.fellowship.weapons;

public abstract class Weapon {
    private int minPower;
    private int maxPower;
    private String type;

    public Weapon(int minPower, int maxPower, String type) {
        this.minPower = minPower;
        this.maxPower = maxPower;
        this.type = type;
    }

    public int getMinPower() {
        return minPower;
    }

    public void setMinPower(int minPower) {
        this.minPower = minPower;
    }

    public int getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
