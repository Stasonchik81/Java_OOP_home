package classes.Units;
/**
 *  */ 
public class Monk extends MentalUnit{
    static {
        Monk.number = 0;
    }
    /**
     * Монах. Может благословить 
     * (повысить уровень защиты unit на время) 
     */
    protected Monk(String name, int hp, int lucky, int protection, int maxPower, int power, int speed, int mana, String team){
        super(name, hp, lucky, protection, maxPower, power, speed, mana, team);
    }
    public Monk(String team){
        this(String.format("Monk #%d", ++Monk.number),
        30, 
        100, 
        7, 
        5,
        2,
        5,
        10,
        team);
    }
    /**
     * Благословить
     * Повышает уровень защиты выбранного юнита
     * на время
     * @return protected points
     * */
    public int bless(){
        int point = Monk.r.nextInt(3, 6);
        this.mana -= (int)(point * 0.5);
        if (this.mana<=0) return 0;
        else return point;
    }  
    
}
