package classes.Units;
/**
 * 
 */
public class Sniper extends Archer{
    static {
        Sniper.number = 0;
    }
    /**
     * Снайпер. Отличается большим уроном при стрельбе.
     */
    protected Sniper(String name, int hp, int lucky, int protection, int maxPower, int power, int speed, int arrows, String team){
        super(name, hp, lucky, protection, maxPower, power, speed, arrows, team);
    }

    public Sniper(String team){
        this(String.format("Sniper #%d", ++Sniper.number),
        15, 
        100, 
        10, 
        10,
        8,
        9,
        32,
        team);
    }
}
