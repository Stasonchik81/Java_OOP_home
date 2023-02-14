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
    public Monk(){
        super(String.format("Monk #%d", ++Monk.number),
        Monk.r.nextInt(40, 60), 
        1, 
        Monk.r.nextInt(12, 23), 
        Monk.r.nextInt(9, 18),
        Monk.r.nextInt(15, 20));
    }
    /**
     * Благословить
     * Повышает уровень защиты выбранного юнита
     * на время
     * @return protected points
     * */
    public int bless(){
        int point = Monk.r.nextInt(5, 10);
        this.mana -= (int)(point * 0.5);
        if (this.mana<=0) return 0;
        else return point;
    }
    /**
     * Лечить (восстанавливает часть hp)
     * @return hp
     */
    @Override
    protected int treat() {
        int hp = Monk.r.nextInt(12, 17);
        this.mana -= (int)(hp * 0.3);
        if(mana<0)return 0;
        else return hp;
    }
    
    
}
