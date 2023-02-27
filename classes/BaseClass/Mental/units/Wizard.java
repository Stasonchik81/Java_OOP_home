package classes.BaseClass.Mental.units;

import classes.BaseClass.BaseUnit;
import classes.BaseClass.Position2D;
import classes.BaseClass.Team;
import classes.BaseClass.Mental.MentalUnit;

public class Wizard extends MentalUnit{
    static {
        Wizard.number = 0;
    }
    /**
     * Колдун. Обладает способностью направлять боевые заклинения и лечить
     */
    protected Wizard(String name, int hp, int lucky, int protection, int maxPower, int power, int speed, int mana, String team, Position2D pos){
        super(name, hp, lucky, protection, maxPower, power, speed, mana, team, pos);
    }
    public Wizard(String name, String team, Position2D pos){
        this(name, 
        30,
        100, 
        12,
        5,
        3,
        9,
        10,
        team, pos);
    }
    /**
     * Колдовать (нанесение урона заклинанием)
     * @return damage (-hp)
     *  */ 
    public void hex(BaseUnit unit){
        int damage = Wizard.r.nextInt(power, maxPower);
        if(mana>(int)(damage * 0.8)){
            this.mana -= (int)(damage * 0.8);
            unit.GetDamage(damage);
        }
    }
    public void step(Team<BaseUnit>a, Team<BaseUnit>b){
        if(this.state.equals(State.IsDead)||this.mana==0)return;
        BaseUnit target = b.units.get(pos.findNearest(b));
        hex(target);


    }

}
