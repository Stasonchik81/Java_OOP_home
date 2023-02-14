package classes.Units;
/**
 * Копейщик. Отличительные особенности не придумал ещё
 */
public class Spearman extends BaseUnit{
    static {
        Spearman.number = 0;
    }
    public Spearman(){
        super(String.format("Spearman #%d", ++number),
        Spearman.r.nextInt(50, 100),
        1,
        Spearman.r.nextInt(12, 15),
        Spearman.r.nextInt(10, 15));
    }
}
