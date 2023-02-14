package classes.Units;
/**
 * Крестьянин
 */
public class Peasant extends BaseUnit{
    static {
        Peasant.number = 0;
    }
    /**
     * Крестьянин. Магу (Wizard) и Монаху (Monk)
     * восстанавливает mana, 
     * Снайперу и арбалетчику восстанавливает запас стрел
     */
    public Peasant(){
        super(String.format("Peasant #%d", ++number),
        Peasant.r.nextInt(50, 100),
        1,
        Peasant.r.nextInt(2, 5),
        Peasant.r.nextInt(2, 5));
    }
   /**
    * Кормить
    * @return mana
    */
    public int feed(){
        int points = Peasant.r.nextInt(10, 20);
        return points;
    }
    /**
     * Пополнить
     * @return arrows
     */
    public int makeUpArrows(){
        int arrows = Peasant.r.nextInt(5, 10);
        return arrows;
    }
}
