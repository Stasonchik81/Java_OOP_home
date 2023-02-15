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
    protected Spearman(String name, int hp, int level, int protection, int powerHit){
        super(name, hp, level, protection, powerHit);
    }

    public Spearman(){
        this(String.format("Spearman #%d", ++Spearman.number),
        Spearman.r.nextInt(50, 100),
        1,
        Spearman.r.nextInt(12, 15),
        Spearman.r.nextInt(10, 15));
    }
}
