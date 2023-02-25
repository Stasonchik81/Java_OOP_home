package classes.BaseClass.units;

import classes.BaseClass.BaseUnit;
import classes.BaseClass.Position2D;
import classes.BaseClass.Team;
import classes.BaseClass.Archer.Archer;
import classes.BaseClass.Mental.MentalUnit;

public class Bandit extends BaseUnit{
    static {
        Bandit.number = 0;
    }
    /**
     * Разбойник. Крадёт вооружение блокируя персонажа на время.
     */
    protected Bandit(String name, int hp, int lucky,int protection, int maxPower, int power, int speed, String team, Position2D pos){
        super(name, hp, lucky, protection, maxPower, power, speed, team, pos);
    }
    public Bandit(String team, Position2D pos){
        this(String.format("Bandit #%d", ++Bandit.number),
        10, 
        100, 
        3,
        4, 
        2,
        6,
        team, pos);
    }
    /**
     * Украсть
     * @return стрелы
     */
  
    protected void theft(BaseUnit unit){
        if(unit instanceof MentalUnit){
            int points = r.nextInt(5, 10);
            ((MentalUnit)unit).downMana(points);
        }
        else if(unit instanceof Archer){
            int arrows = Peasant.r.nextInt(1, 3);
            ((Archer)unit).turnDownArrows(arrows);
        }
    }
    public void step(Team<BaseUnit>a, Team<BaseUnit>b){
        if(this.state.equals(State.IsDead))return;
        BaseUnit target = b.units.get(pos.findNearest(b));
        theft(target);
    }
}
