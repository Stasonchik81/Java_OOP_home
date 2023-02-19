package classes.Units;

public class Bandit extends BaseUnit{
    static {
        Bandit.number = 0;
    }
    /**
     * Разбойник. Крадёт вооружение блокируя персонажа на время.
     */
    protected Bandit(String name, int hp, int lucky,int protection, int maxPower, int power, int speed, String team){
        super(name, hp, lucky, protection, maxPower, power, speed, team);
    }
    public Bandit(String team){
        this(String.format("Bandit #%d", ++Bandit.number),
        10, 
        100, 
        3,
        4, 
        2,
        6,
        team);
    }
    /**
     * Украсть
     * @return блокировка противника
     */
    public boolean theft(){
        boolean isBlock;
        isBlock = Peasant.r.nextInt(1, 3)>2 ? true : false;
        return isBlock;
    }

}
