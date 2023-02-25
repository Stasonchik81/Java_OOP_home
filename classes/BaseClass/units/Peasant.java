package classes.BaseClass.units;

import classes.BaseClass.BaseUnit;
import classes.BaseClass.Position2D;
import classes.BaseClass.Team;
import classes.BaseClass.Archer.Archer;
import classes.BaseClass.Mental.MentalUnit;

/**
 * Крестьянин
 */
public class Peasant extends BaseUnit{
    static {
        Peasant.number = 0;
    }
    /**
     * Крестьянин. Магу (Wizard) и Монаху (Monk)
     * восстанавливает mana, 
     * Снайперу и арбалетчику восстанавливает запас стрел
     */
    protected Peasant(String name, int hp, int lucky,int protection, int maxPower, int power, int speed, String team, Position2D pos){
        super(name, hp, lucky, protection, maxPower, power, speed, team, pos);
    }
    public Peasant(String team, Position2D pos){
        this(String.format("Peasant #%d", ++Peasant.number),
        3,
        100,
        1,
        2,
        1,
        3,
        team, pos);
    }
   /**
    * Пополнить запасы
    */
    public void restock(BaseUnit unit){
        if(unit instanceof MentalUnit){
            int points = Peasant.r.nextInt(5, 10);
            ((MentalUnit)unit).upMana(points);
        }
        else if(unit instanceof Archer){
            int arrows = Peasant.r.nextInt(1, 3);
            ((Archer)unit).setUpArrows(arrows);
        }
    }
    
    /**
     * Пополнить запас стрел
     * @return arrows
     */
    public void makeUpArrows(Archer unit){
        int arrows = Peasant.r.nextInt(1, 3);
        unit.setUpArrows(arrows);
        
    }
    public void step(Team<BaseUnit>a, Team<BaseUnit>b){
        if(this.state.equals(State.IsDead))return;
        BaseUnit target = a.units.get(pos.findNearest(a));
        restock(target);
    }
}
