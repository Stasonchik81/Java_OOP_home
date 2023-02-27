package classes.BaseClass.Archer.units;

import classes.BaseClass.Position2D;
import classes.BaseClass.Team;
import classes.BaseClass.Archer.Archer;

public class Arbalester extends Archer {
    static{
        Arbalester.number = 0;
    }
    /**
     * Арбалетчик. Атакует как на расстоянии так и в ближнем бою.
     */
    protected Arbalester(String name, int hp, int lucky, int protection, int maxPower, int power, int speed, int arrows, String team, Position2D pos){
        super(name, hp, lucky, protection, maxPower, power, speed, arrows, team, pos);
    }

     public Arbalester(String name, String team, Position2D pos){
        this(name,
        10, 
        100, 
        3, 
        3,
        2,
        4,
        16,
        team, pos);
    }
    
}
