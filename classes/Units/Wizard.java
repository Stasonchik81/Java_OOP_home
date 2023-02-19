package classes.Units;

public class Wizard extends MentalUnit{
    static {
        Wizard.number = 0;
    }
    /**
     * Колдун. Обладает способностью направлять боевые заклинения и лечить
     */
    protected Wizard(String name, int hp, int lucky, int protection, int maxPower, int power, int speed, int mana, String team){
        super(name, hp, lucky, protection, maxPower, power, speed, mana, team);
    }
    public Wizard(String team){
        this(String.format("Wizard #%d", ++Wizard.number), 
        30,
        100, 
        12,
        5,
        3,
        9,
        10,
        team);
    }
    /**
     * Колдовать (нанесение урона заклинанием)
     * @return damage (-hp)
     *  */ 
    public int hex(){
        int damage = Wizard.r.nextInt(maxPower, power);
        this.mana -= (int)(damage * 0.8);
        if(mana<0)return 0;
        else return damage;
    }

}
