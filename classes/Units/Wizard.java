package classes.Units;

public class Wizard extends MentalUnit{
    static {
        Wizard.number = 0;
    }
    /**
     * Колдун. Обладает способностью направлять боевые заклинения и лечить
     */
    protected Wizard(String name, int hp, int level, int protection, int powerHit, int mana){
        super(name, hp, level, protection, powerHit, mana);
    }
    public Wizard(){
        this(String.format("Wizard #%d", ++Wizard.number), 
        Wizard.r.nextInt(70, 120),
        1, 
        Wizard.r.nextInt(15, 25),
        Wizard.r.nextInt(10, 20),
        Wizard.r.nextInt(20, 30));
    }
    /**
     * Колдовать (нанесение урона заклинанием)
     * @return damage (-hp)
     *  */ 
    public int hex(){
        int damage = Wizard.r.nextInt(7, 10);
        this.mana -= (int)(damage * 0.8);
        if(mana<0)return 0;
        else return damage;
    }

    /**
     * Лечить (восстанавливает часть hp)
     * @return +hp
     */
    public int treat(){
        int hp = Wizard.r.nextInt(5, 10);
        this.mana -= (int)(hp * 0.5);
        if(mana<0)return 0;
        else return hp;
    }

}
