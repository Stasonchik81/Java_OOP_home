package classes.Units;
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
    protected Spearman(String name, int hp, int lucky,int protection, int maxPower, int power, int speed, String team){
        super(name, hp, lucky, protection, maxPower, power, speed, team);
    }

    public Spearman(String team){
        this(String.format("Spearman #%d", ++Spearman.number),
        10,
        100,
        5,
        3,
        1,
        2,
        team);
    }
}
