package classes.Units;
/**
 * 
 */
public class Sniper extends Archer{
    static {
        Sniper.number = 0;
    }
    /**
     * Снайпер. Отличается большим уроном при стрельбе.
     */
    protected Sniper(String name, int hp, int level, int protection, int powerHit, int arrows){
        super(name, hp, level, protection, powerHit, arrows);
    }

    public Sniper(){
        this(String.format("Sniper #%d", ++Sniper.number),
        Sniper.r.nextInt(60, 110), 
        1, 
        Sniper.r.nextInt(10, 20), 
        Sniper.r.nextInt(7, 15),
        Sniper.r.nextInt(3, 5));
    }
    /**
     * Стрелять
     */
    @Override
    public int shoot() {
        int damage = Sniper.r.nextInt(25, 35);
        --this.arrows;
        if (this.arrows<=0) return 0;
        else return damage;
    }
}
