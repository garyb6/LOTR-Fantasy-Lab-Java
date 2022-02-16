package enemies;

import players.Player;

public abstract class Enemy {
    private double hp;
    private String name;
    private int power;

    public Enemy(double hp, String name, int power) {
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

    public int attack(Player player){
        double damage = 0;
        int max = (this.power * 2);
        int range = max - this.power;
        for (int i = 0; i < max; i++) {
            damage = (Math.random() * range) + this.power;
        }
        return (int) Math.ceil(damage);
    }
}
