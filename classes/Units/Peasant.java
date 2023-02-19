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
    protected Peasant(String name, int hp, int lucky,int protection, int maxPower, int power, int speed, String team){
        super(name, hp, lucky, protection, maxPower, power, speed, team);
    }
    public Peasant(String team){
        this(String.format("Peasant #%d", ++Peasant.number),
        3,
        100,
        1,
        2,
        1,
        3,
        team);
    }
   /**
    * Кормить
    * @return mana
    */
    public int feed(){
        int points = Peasant.r.nextInt(5, 10);
        return points;
    }
    /**
     * Пополнить запас стрел
     * @return arrows
     */
    public int makeUpArrows(){
        int arrows = Peasant.r.nextInt(1, 3);
        return arrows;
    }
}
