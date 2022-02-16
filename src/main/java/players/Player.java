package players;

public abstract class Player {

    private double hp;
    private String name;
    private int power;

    public Player(double hp, String name, int power) {
        this.hp = hp;
        this.name = name;
        this.power = power;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void takeDamage(int damage){
        setHp(this.hp -= damage);
    }
}
