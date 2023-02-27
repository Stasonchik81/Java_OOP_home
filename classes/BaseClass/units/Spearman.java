package classes.BaseClass.units;

import classes.BaseClass.BaseUnit;
import classes.BaseClass.Distance;
import classes.BaseClass.Position2D;
import classes.BaseClass.Team;

/**
 * Копейщик. Отличительные особенности не придумал ещё
 */
public class Spearman extends BaseUnit{
    static {
        Spearman.number = 0;
    }
    /**
     * 
     */
    protected Spearman(String name, int hp, int lucky,int protection, int maxPower, int power, int speed, String team, Position2D pos){
        super(name, hp, lucky, protection, maxPower, power, speed, team, pos);
    }

    public Spearman(String name, String team, Position2D pos){
        this(name,
        10,
        100,
        5,
        3,
        1,
        2,
        team, pos);
    }
    
    public void step(Team<BaseUnit>a, Team<BaseUnit>b){
        if(this.state.equals(State.IsDead))return;
        BaseUnit target = a.units.get(pos.findNearest(a));
        Attack(target);
    }

}
