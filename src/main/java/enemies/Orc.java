package enemies;
import java.util.Random;

public class Orc extends Enemy {

    public Orc(String name, double hp, int power) {
        super(name, hp, power);
    }

    public String fleeBattle(){
        String statement = null;
        if (getHp() < 5) {
            int number = 0;
            Random random = new Random();
            if (random.nextBoolean()) {
                number = 1;
            } else {
                number = 2;
                statement = "Orc flees the battle!";
            }
        }
        return statement;
    }
}
