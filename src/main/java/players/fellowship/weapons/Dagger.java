package players.fellowship.weapons;


public class Dagger extends Weapon{

    private String type;

    public Dagger(int minPower, int maxPower) {
        super(minPower, maxPower);
        this.type = "Dagger";
    }

}
