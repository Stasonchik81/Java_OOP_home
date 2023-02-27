package classes.BaseClass.Mental.units;

import classes.BaseClass.BaseUnit;
import classes.BaseClass.Distance;
import classes.BaseClass.Position2D;
import classes.BaseClass.Team;
import classes.BaseClass.Mental.MentalUnit;

/**
 *  */ 
public class Monk extends MentalUnit{
    static {
        Monk.number = 0;
    }
    /**
     * Монах. Может благословить 
     * (повысить уровень защиты unit на время) 
     */
    protected Monk(String name, int hp, int lucky, int protection, int maxPower, int power, int speed, int mana, String team, Position2D pos){
        super(name, hp, lucky, protection, maxPower, power, speed, mana, team, pos);
    }
    public Monk(String name, String team, Position2D pos){
        this(name,
        30, 
        100, 
        7, 
        5,
        2,
        5,
        10,
        team, pos);
    }
    /**
     * Благословить
     * Повышает уровень защиты выбранного юнита
     * @return protections points
     * */
    public void bless(BaseUnit unit){
        int points = Monk.r.nextInt(5, 10);
        if(mana>(int)(points * 0.5)){
            this.mana -= (int)(points * 0.5);
            unit.upProtection(points);
        }
    }
    public void step(Team<BaseUnit>a, Team<BaseUnit>b){
        if(this.state.equals(State.IsDead)||this.mana==0)return;
        BaseUnit target = a.units.get(pos.findNearest(a));
        bless(target);

    }  
    
}
