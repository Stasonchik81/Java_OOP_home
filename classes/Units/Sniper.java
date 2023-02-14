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
    public Sniper(){
        super(String.format("Sniper #%d", ++number),
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
    protected int shoot() {
        int damage = Sniper.r.nextInt(25, 35);
        --this.arrows;
        if (this.arrows<=0) return 0;
        else return damage;
    }
}
