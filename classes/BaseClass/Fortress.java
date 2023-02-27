package classes.BaseClass;
import classes.BaseClass.Archer.units.Arbalester;
import classes.BaseClass.Archer.units.Sniper;
import classes.BaseClass.Mental.units.Monk;
import classes.BaseClass.Mental.units.Wizard;
import classes.BaseClass.units.Bandit;
import classes.BaseClass.units.Peasant;
import classes.BaseClass.units.Spearman;


public class Fortress {
    public static BaseUnit createUnit(int i, String name, String team, Position2D pos){
        switch(i){
            case 1: return new Peasant(name, team, pos);
            case 2: return new Bandit(name, team, pos);
            case 3: return new Sniper(name, team, pos);
            case 4: return new Wizard(name, team, pos);
            case 5: return new Peasant(name, team, pos);
            case 6: return new Spearman(name, team, pos);
            case 7: return new Monk(name, team, pos);
            case 8: return new Arbalester(name, team, pos);
        }
        return null;
    }
}
