package classes.Units;

public class Arbalester extends Archer {
    static{
        Arbalester.number = 0;
    }
    /**
     * Арбалетчик. Атакует как на расстоянии так и в ближнем бою.
     */
    protected Arbalester(String name, int hp, int lucky, int protection, int maxPower, int power, int speed, int arrows, String team){
        super(name, hp, lucky, protection, maxPower, power, speed, arrows, team);
    }

     public Arbalester(String team){
        this(String.format("Arbalester #%d", ++Arbalester.number),
        10, 
        100, 
        3, 
        3,
        2,
        4,
        16,
        team);
    }
    
}
