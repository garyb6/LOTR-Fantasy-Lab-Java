package players;

public abstract class Player {

    private double hp;
    private String name;

    public Player(double hp, String name) {
        this.hp = hp;
        this.name = name;
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
