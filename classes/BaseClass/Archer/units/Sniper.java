package classes.BaseClass.Archer.units;

import classes.BaseClass.Position2D;
import classes.BaseClass.Archer.Archer;

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
    protected Sniper(String name, int hp, int lucky, int protection, int maxPower, int power, int speed, int arrows, String team, Position2D pos){
        super(name, hp, lucky, protection, maxPower, power, speed, arrows, team, pos);
    }

    public Sniper(String name, String team, Position2D pos){
        this(name,
        15, 
        100, 
        10, 
        10,
        8,
        9,
        32,
        team, pos);
    }
}
