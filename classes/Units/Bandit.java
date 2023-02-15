package classes.Units;

public class Bandit extends BaseUnit{
    static {
        Bandit.number = 0;
    }
    /**
     * Разбойник. Крадёт вооружение блокируя персонажа на время.
     */
    protected Bandit(String name, int hp, int level, int protection, int powerHit){
        super(name, hp, level, protection, powerHit);
    }
    public Bandit(){
        this(String.format("Bandit #%d", ++Bandit.number),
        Bandit.r.nextInt(60, 110), 
        1, 
        Bandit.r.nextInt(10, 20), 
        Bandit.r.nextInt(7, 15));
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
